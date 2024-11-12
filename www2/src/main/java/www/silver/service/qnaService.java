package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import www.silver.dao.IF_qnaDao;
import www.silver.vo.questionVO;

@Repository
public class qnaService implements IF_qnaService{
	@Inject
	IF_qnaDao qnadao;
	
	@Override
	public List<questionVO> showQ() {
		return qnadao.selectAllQ();
	}

	@Override
	public void addQ() {
		qnadao.insertQ();
	}

}
