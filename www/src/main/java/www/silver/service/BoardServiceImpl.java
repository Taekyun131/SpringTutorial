package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_BoardDAO;
import www.silver.vo.BoardVO;

@Service
public class BoardServiceImpl implements IF_BoardService {
	
	@Inject
	IF_BoardDAO boarddao;
	@Override
	public void addBoard(BoardVO boardvo) throws Exception {
		if(boardvo.getViewmember()!=null) {
			if(boardvo.getViewmember().equals("1")) {
				boardvo.setViewmember("공개");
			}
		}else {
			boardvo.setViewmember("비공개");
		}
		boarddao.insertBoard(boardvo);
		//dao>>mapper>>DB insert
	}
	@Override
	public List<BoardVO> boardList() throws Exception {
		//처리하다가 DB작업이 필요..
		List<BoardVO> list=boarddao.selectAll();
		for(BoardVO b:list) {
			String date=b.getIndate();
			b.setIndate(date.substring(0,10));
		}//서버사이드랜더링>>서버에게 부담을 준다.
		//뷰에서 substring하는 방법찾기...
		return boarddao.selectAll();
	}
	@Override
	public void deleteBoard(String delno) throws Exception {
		boarddao.deleteBoard(delno);
	}
	
	
}
