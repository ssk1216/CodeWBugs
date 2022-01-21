public class cw_155_1258 {
String swapEnds(String word){
	   char firstLetter = word.charAt(0);
       int length = word.length();
       char lastLetter = word.charAt(length-1);
       String middleLetters = word.substring(1,(length-1));
       if (length > 1)
           return lastLetter + middleLetters + firstLetter;
       else
           return word;
}

}