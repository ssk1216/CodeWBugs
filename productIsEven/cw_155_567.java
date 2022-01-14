public class cw_155_567 {
 	boolean productIsEven(int a, int b){
	    
        int product = 2 %(a * b);
        boolean evenOr = product == 1;
        return evenOr;
	}
}
