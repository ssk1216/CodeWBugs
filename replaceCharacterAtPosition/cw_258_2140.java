package ex_replaceCharacterAtPosition;

public class cw_258_2140 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
		char letter = word.charAt(position);
		letter = replacement;
		return word.substring(0,position) + letter + word.substring(position);
	
}}
