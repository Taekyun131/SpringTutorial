package www.silver.hom;

import java.util.ArrayList;

public class WordDAO {
	private static WordDAO wdao=null;
//	String Word[] wordList=new String[5];
	ArrayList<Word> wordList= new ArrayList<>();
	WordDAO(){
		
	}
	public void insertWord(Word wdto) {
//		for(int i=0;i<wordList.length;i++) {
//			if(wordList[i]==null) {
//				wordList[i]=wdto;
//				break;
//			}
//		}
		wordList.add(wdto);
	}
	
	public static WordDAO getInstance() {
		if(wdao==null) {
			wdao=new WordDAO();
		}
		return wdao;
	}
//	public Word[] showList() {
//		return wordList;
//	}
	public ArrayList<Word> showList(){
		return wordList;
	}
	
	public Word searchWord(String word) {
//		for(int i=0;i<wordList.length;i++) {
//			if(wordList[i]!=null) {
//				if(wordList[i].getTitle().equals(word)) {
//					return wordList[i];
//				}
//			}
//		}
		for(Word temp:wordList) {
			if(temp.getTitle().equals(word)) {
				return temp;
			}
		}
		
		return null;
	}
}
