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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/** aaa
 * Handles requests for the application home page.
 */
@Controller		// Ŭ�����̸����� @Controller => ��Ʈ�ѷ� ��Ȱ�ϰԵ�!
//@RestController
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)	// @RequestMapping Ŭ���̾�Ʈ�� ��û / ��û�� ������  "/"
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";	// "home" �� �����ϴ� ���ϸ�  (�ڿ� .jsp ������) ���ڿ��� ���ϸ����� �ν�~
		// src/main/WEB-INF/views  ��ο� home.jsp
	}
	
	//https://bubblecastle.tistory.com/9
	
	@RequestMapping(value = "/timeline", method = RequestMethod.GET)
	public String timeline() {
		return "timeline"; 
	}
	
	@RequestMapping(value = "/viewMessage", method = RequestMethod.POST)
	public String viewMessage(@RequestParam("time") String t,
			@RequestParam("name") String n,Model m) {
		//디버깅-확인용
//		System.out.print(t+"/"+n);
//		ModelAndView mm=new ModelAndView();
		m.addAttribute("변수명","값");
		m.addAttribute("time",t);
		m.addAttribute("name",n);
		m.addAttribute("age",1);
		return "viewMsg"; 
	}
	@RequestMapping(value = "/viewMessage", method = RequestMethod.GET)
	public String viewMessage1(@RequestParam("time") String t,
			@RequestParam("name") String n,Model m) {
		//디버깅-확인용
//		System.out.print(t+"/"+n);
//		ModelAndView mm=new ModelAndView();
		m.addAttribute("변수명","값");
		m.addAttribute("time",t);
		m.addAttribute("name",n);
		m.addAttribute("age",1);
		return "viewMsg"; 
	}
}
