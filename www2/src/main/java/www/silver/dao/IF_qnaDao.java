package www.silver.dao;

import java.util.List;

import www.silver.vo.questionVO;

public interface IF_qnaDao {

	public List<questionVO> selectAllQ();
	public void insertQ();

}
