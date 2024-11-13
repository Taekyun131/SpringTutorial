package www.silver.dao;

import java.util.List;

import www.silver.vo.BoardVO;

public interface IF_BoardDAO {
	//DB작업이 목적
	//Mybatis mapper랑 매핑해서 db작업을 수행
	public void insertBoard(BoardVO boardvo) throws Exception;
	public List<BoardVO> selectAll() throws Exception;
	public void deleteBoard(String delno) throws Exception;
	public BoardVO selectOne(String modno) throws Exception;
	public void updateBoard(BoardVO bvo) throws Exception;
}
