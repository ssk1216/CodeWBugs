package ex_replaceCharacterAtPosition;

public class cw_242_772 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
		word.replace(word.charAt(position), replacement);
		return word;

   }
	
}
