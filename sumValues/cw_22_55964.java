public class cw_22_55964 {
	int sumValues(int[] values, boolean positivesOnly){
		int sum = 0;
		for (int i = 0;  i < values.length; i++){
			if (positivesOnly == true && values[i] % 2 == 0){
				sum = sum + values[i];
			} else if (positivesOnly == false){ 
				sum = sum + values[i];
			} else {
				sum = sum;
			}
		}
		return sum;

						
	}
}