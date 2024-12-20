package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_BoardDAO;
import www.silver.vo.BoardVO;
import www.silver.vo.PageVO;

@Service
public class BoardServiceImpl implements IF_BoardService {
	
	@Inject
	IF_BoardDAO boarddao;
	@Override
	public void addBoard(BoardVO boardvo) throws Exception {
		if(boardvo.getViewmember()!=null) {
			if(boardvo.getViewmember().equals("1")) {
				boardvo.setViewmember("비공개");
			}
		}else {
			boardvo.setViewmember("공개");
		}
		//게시글을 kboard에 저장
		boarddao.insertBoard(boardvo);
		//dao>>mapper>>DB insert
		
		//첨부파일이 있다면 첨부파일을 kboard_attach별도로 저장
		String[] fname=boardvo.getFiliename();
		
		for(int i=0;i<fname.length;i++) {
			//kboard_attach테이블에 저장하는 코드
			if(fname[i]!=null) { 
				
				boarddao.insertAttach(fname[i]);
			}
		}
	}
	@Override
	public List<BoardVO> boardList(PageVO pagevo) throws Exception {
		//처리하다가 DB작업이 필요..
		List<BoardVO> list=boarddao.selectAll(pagevo);
		for(BoardVO b:list) {
			String date=b.getIndate();
			b.setIndate(date.substring(0,10));
		}//서버사이드랜더링>>서버에게 부담을 준다.
		//뷰에서 substring하는 방법찾기...
		return list;
	}
	@Override
	public void deleteBoard(String delno) throws Exception {
		boarddao.deleteBoard(delno);
	}
	@Override
	public BoardVO modBoard(String modno) throws Exception {
		return boarddao.selectOne(modno);
	}
	@Override
	public void modBoard(BoardVO bvo) throws Exception {
		if(bvo.getViewmember()!=null) {
			if(bvo.getViewmember().equals("1")) {
				bvo.setViewmember("비공개");
			}
		}else {
			bvo.setViewmember("공개");
		}
		boarddao.updateBoard(bvo);
	}
	@Override
	public int totalCountBoard() throws Exception {
		return boarddao.cntBoard();
	}
	@Override
	public BoardVO getBoard(String no) throws Exception {
		return boarddao.selectOne(no);
		
	}
	@Override
	public List<String> getAttach(String no) throws Exception {
		
		return boarddao.selectAllAttach(no);
	}
	
	
}
