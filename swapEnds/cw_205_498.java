public class cw_205_498 {
String swapEnds(String word){
	String lastLetter = word.substring(word.length() - 1);
	String firstLetter = word.substring(0, 1);
	String middlePart = word.substring(1, (word.length() - 1));
	String wordFinal = lastLetter + middlePart + firstLetter;
	return wordFinal;

}
}