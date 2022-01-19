package ex_replaceCharacterAtPosition;

public class cw_205_502 {
 
	String replaceCharacterAtPosition(int position, String word, char replacement){
		String firstPart = word.substring(0, position);
		String secongPart = word.substring(position);
		return firstPart + replacement + secongPart;
   }
	
}
