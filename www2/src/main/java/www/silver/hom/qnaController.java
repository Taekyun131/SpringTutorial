package www.silver.hom;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import www.silver.service.IF_qnaService;

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
	
	@PostMapping(value="save")
	public String save( ) {
		return "redirect:qna";
	}
}
