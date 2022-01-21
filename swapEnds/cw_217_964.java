public class cw_217_964 {
String swapEnds(String word){
	if(word.length() == 1){        
		return word;
		}else if (word.length()==0){
		return "";
		}else{   
		return word.replace((word.charAt(0)),(word.charAt(word.length())))+ word.replace(word.charAt(word.length()),(word.charAt(0))); 
		}
	
	 
}

}