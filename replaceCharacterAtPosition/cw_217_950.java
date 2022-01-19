package ex_replaceCharacterAtPosition;

public class cw_217_950 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
		String startOfWord = word.substring(0,(position-1));
		String endOfWord = word.substring(position+1,(word.length()));
		return startOfWord + replacement + endOfWord;
		
		 
   }
	
}
