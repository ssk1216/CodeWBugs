package ex_replaceCharacterAtPosition;

public class cw_53_1173 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
		return(word.substring(0,position)+replacement+word.substring(position));
	
}}
