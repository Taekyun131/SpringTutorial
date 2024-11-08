package www.silver.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.MemberVO;
@Repository
public class MemberDAOimpl implements IF_MemberDAO{
	
	//sqlSession이 필요	Mybatis에서 제공하는 객체
	//주소가 올바르게 주입되려면 root-context.xml에서 설정이 잘 되어있어야 한다.
	@Inject
	SqlSession sqlSession;
	private static String mapperQuerry="www.silver.dao.IF_MemberDAO";
	@Override
	public void insertOne(MemberVO membervo) throws Exception {
		//sqlSessionTemplate의 객체의 메서드를  call하면 된다
//		sqlSession.insert("mapper와 매핑정보", "파라미터값");
		sqlSession.insert(mapperQuerry+ ".insertOne", membervo);
		//www.silver.dao.IF_MemberDAO.insertOne<<매핑의 정보
	}
	
}
