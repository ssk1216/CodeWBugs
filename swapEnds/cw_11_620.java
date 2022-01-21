public class cw_11_620 {
String swapEnds(String word){
	char lastLetter = word.charAt(word.length()-1);
	char firstLetter = word.charAt(0);
	String newWord = lastLetter + word.substring(1, word.length()-1) + firstLetter;
	return newWord;
	
	
	
	 
	
	 
}

}