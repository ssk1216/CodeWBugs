public class cw_263_55382 {
boolean magicNumbers(int a, int b){
	 
	 
	String c = String.valueOf(a);
	String d = String.valueOf(b);

	if (c.length()==(d.length()) && a!=b && a%b == 0 || b%a==0) {
	return true;
	} else if (a==b) {
	return false;
	}
	return false;

	
 

}
}