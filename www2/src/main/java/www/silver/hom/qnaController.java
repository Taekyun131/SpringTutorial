package www.silver.hom;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import www.silver.service.IF_qnaService;
import www.silver.vo.questionVO;

@Controller	
public class qnaController {
	@Inject
	IF_qnaService qnaservice;
	@GetMapping(value="question")
	public String qna() {
		qnaservice.showQ();
		return "qna";
	}
	
	@GetMapping(value="write")
	public String write() {
		return "write";
	}
	
	@GetMapping(value="save")
	public String save(@ModelAttribute questionVO qvo) {
		System.out.println(qvo.toString());
		return "redirect:qna";
	}
}
