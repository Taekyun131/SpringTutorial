package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.questionVO;

@Repository
public class qnaDao implements IF_qnaDao{
	
	@Inject
	SqlSession sqlsession;
	String mapperQuery="www.silver.dao.IF_qnaDao";
	@Override
	public List<questionVO> selectAllQ() {
		
//		return sqlsession.selectList(mapperQuery+".selectAllQ");
		return null;
	}
	@Override
	public void insertQ() {
		
	}

}
