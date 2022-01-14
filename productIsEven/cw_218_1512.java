
public class cw_218_1512 {
	boolean productIsEven(int a, int b){
		double totalProduct = (double)(a * b);
		double totalDivisor = (totalProduct/2);
		int totalRemainder = (int)(totalDivisor%2);	
			if ( totalRemainder >= 1) {
				return false;
			} else {
				return true;
			}
	}
}
