package www.silver.service;

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
		if(boardvo!=null) {
			if(boardvo.getViewmember().equals("1")) {
				boardvo.setViewmember("공개");
			}else {
				boardvo.setViewmember("비공개");
			}
		}
		boarddao.insertBoard(boardvo);
		//dao>>mapper>>DB insert
	}
	
	
}
