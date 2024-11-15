package www.silver.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle에 진입하였습니다.");
		//로그인 판단 유무 비지니스 서비스를 처리
		//세션을 가져와서 세션이 있다면 로그인한 사람없다면
		//로그인을 안했으니 메인화면으로리턴
		HttpSession session =request.getAttribute("id");
		if(nowid!=null) {//세션값이 없다
			response.sendRedirect(request.con)
		}
		
		return super.preHandle(request, response, handler);
	}
	
}
