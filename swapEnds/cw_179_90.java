public class cw_179_90 {
String swapEnds(String word){
	  String middle = word.substring(1,word.length());
      char start = word.charAt(0);
      char end = word.charAt(word.length() - 1);
      return end + middle + start;
}
}