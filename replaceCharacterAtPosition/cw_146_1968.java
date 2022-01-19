package ex_replaceCharacterAtPosition;

public class cw_146_1968 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
		String replacedLetter = word.substring(0,position) + replacement + word.substring(position+1, word.length() - 1);
		return replacedLetter;
	
}}
