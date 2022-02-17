public class cw_260_54456 {
boolean magicNumbers(int a, int b){
	 
 
	
	
	boolean magicNumbers = true;

	String aString = String.valueOf(a);
	String bString = String.valueOf(b);

	if (aString.length() == bString.length()){
	if (a!=b){
	if ((Math.max(a,b) % Math.min(a,b))!=0 ){
	}
	}
	return magicNumbers;
	} else {
	return false;
	}

	
 

}
}