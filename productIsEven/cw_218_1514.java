public class cw_218_1514 {
	boolean productIsEven(int a, int b){
		int totalProduct = (a * b);
		int totalDivisor = (totalProduct/2);
		int totalRemainder = (totalDivisor%2);	
			if ( totalRemainder >= 1) {
				return false;
			} else {
				return true;
			}
	}
}
