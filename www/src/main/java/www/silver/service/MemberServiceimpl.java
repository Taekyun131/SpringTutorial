package www.silver.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_MemberDAO;
import www.silver.vo.MemberVO;
@Service	//해당 클래스를 객체로 만들어라..
public class MemberServiceimpl implements IF_MemberService{
	@Inject
	IF_MemberDAO memberdao;
	@Override
	public void join(MemberVO membervo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("join 서비스");
		//아이디 검사, 중복체크 등 작업가능... 생략
		//dao에게 작업 지시해야한다...
		//실제 데이터를 저장하도록 지시
		memberdao.insertOne(membervo);
	}

}
