package www.silver.hom;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** aaa
 * Handles requests for the application home page.
 */
@Controller		// 클래스이름위에 @Controller => 컨트롤러 역활하게따!
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)	// @RequestMapping 클라이언트가 요청 / 요청한 내용은  "/"
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";	// "home" 이 응답하는 파일명  (뒤에 .jsp 생략됨) 문자열을 파일명으로 인식~
		// src/main/WEB-INF/views  경로에 home.jsp
	}
	
	//https://bubblecastle.tistory.com/9
	
	@RequestMapping(value = "/timeline", method = RequestMethod.GET)
	public String timeline() {
		return "timeline"; 
	}
	
	@RequestMapping(value = "/viewMessage", method = RequestMethod.GET)
	public String viewMessage() {
		return "viewMsg"; 
	}
}
