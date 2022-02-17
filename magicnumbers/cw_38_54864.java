public class cw_38_54864 {
boolean magicNumbers(int a, int b){
	 
	 
	int lengthA = String.valueOf(a).length();
	int lengthB = String.valueOf(b).length();
	if ((a%b!=0 || b%a!=0) && lengthA==lengthB && a!=b) {
	return true;
	}
	return false;
	
 

}
}