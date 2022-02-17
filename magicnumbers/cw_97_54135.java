public class cw_97_54135 {
boolean magicNumbers(int a, int b){
	 
	 
	
	
	
	String aStr = Integer.toString(a);
	String bStr = Integer.toString(b);
	int aLength = aStr.length();
	int bLength = bStr.length();
	int bigger = Math.max(a,b);
	int smaller = Math.min(a,b);
	return (aLength == bLength && a!=b || bigger%smaller==0);


}
}