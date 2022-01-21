public class cw_53_1158 {
String swapEnds(String word){
	char firstLetter = word.charAt(0);
	char lastLetter = word.charAt(word.length()-1);
	String middle = word.substring(1, word.length()-1);

	if(word.length()==2)return ""+lastLetter+firstLetter;
	if(word.length()<2)return word;
	if(word.length()>2)return ""+lastLetter+middle+firstLetter;
	return "ahat";
}

}