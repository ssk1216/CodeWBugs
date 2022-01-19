package ex_replaceCharacterAtPosition;

public class cw_276_1341 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
	    String newWord = (word.substring(0, position-1)+replacement+word.substring(position+1));
	      return newWord;
}}
