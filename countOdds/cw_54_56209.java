public class cw_54_56209 {
	int countOdds(int[] values){
		int sum = 0;
		for(int i = 0; i < values.length; i++) {

		if (values[i] % 2 != 0) {
		sum += sum;

		} else {
		sum = 0;

		}
		}
		return sum;

	}
}