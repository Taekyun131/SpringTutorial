package www.silver.hom;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WordController {
	WordDAO wdao=WordDAO.getInstance();
	@RequestMapping(value = "word", method = RequestMethod.GET)
	public String asdf() {
		return "word/index";
	}
	
	@RequestMapping(value="search", method=RequestMethod.GET)
	public String searchWord(@RequestParam("word") String word, Model m) {
//		Word wordList[]= new Word[5];
		Word temp=wdao.searchWord(word);
		if(temp!=null) {
			m.addAttribute("inWord",temp.getTitle());
			m.addAttribute("inMeaning",temp.getMeaning());
			return "word/meaning";
		}
		return "word/noWord";
		
	}
	
	@RequestMapping(value="input", method=RequestMethod.GET)
	public String inputWord(@RequestParam("inputWord") String inWord,
			@RequestParam("inputMeaning") String inMeaning, Model m) {
//		String wordList[]=new String[5];
//		System.out.println(wordList[0]);
//		ArrayList wordList<Word>=new ArrayList<>();
//		Word wordList[]= new Word[5];
		Word wdto=new Word();
		wdto.setTitle(inWord);
		wdto.setMeaning(inMeaning);
		wdao.insertWord(wdto);
//		Word[] wordList=wdao.showList();
//		for(int i=0;i<wordList.length;i++) {
//			if(wordList[i]!=null) {
//				System.out.println(wordList[i].getTitle());
//			}
//		}
		ArrayList<Word> wordList=wdao.showList();
		for(Word temp:wordList) {
			System.out.println(temp.getTitle());
		}
		return "word/index";
//		for(int i=0;i<wordList.length;i++) {
//			if(wordList[i]!=null) {
//				wordList[i]=wdto;
//			}
//		}
		
//		System.out.println(wordList[0].getTitle()+"/"+wordList[0].getMeaning());
//		m.addAttribute("inWord",wordList[0].getTitle());
//		m.addAttribute("inMeaning",wordList[0].getMeaning());
//		return "word/meaning";
		
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String delWord(@RequestParam("delWord") String delWord) {
		wdao.delWord(delWord);
		ArrayList<Word> wordList=wdao.showList();
		for(Word temp:wordList) {
			System.out.println(temp.getTitle());
		}
		return "word/index";
	}
}
