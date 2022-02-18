public class cw_38_54609 {
	int sumValues(int[] values, boolean positivesOnly){
		int sum = 0;

		if (values.length<1){
		return -1;
		}

		if (positivesOnly) {

		for (int i = 0; i<= values.length-1; i++) {
		if (values[i]>0) {
		sum += values[i]; 
		}
		} return sum;
		}
		if (!positivesOnly) {
		for (int a = 0; a<= values.length-1; a++) {
		sum += values[a];
		}
		return sum; 
		}
		return -1;
	}
}