package ex_replaceCharacterAtPosition;

public class cw_151_1168 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
		if (word.charAt(position) != -1) {
			   String front = word.substring(0, position);
			   String back = word.substring(position + 1, word.length() - 1);

			   return front + replacement + back;
			} else {
			   return word;
			}
	
}}
