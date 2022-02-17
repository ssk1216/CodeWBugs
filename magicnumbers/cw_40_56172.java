public class cw_40_56172 {
boolean magicNumbers(int a, int b){
	 
	 
	int c;
	int d;
	c = Math.max(a,b);
	d = Math.min(a,b);
	if(c / d > 1 && a!=b && c % b == 0){
	return true;
	}else{
	return false;
	}

	
 

}
}