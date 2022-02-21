public class cw_54_56230 {
	int positionOfValueInArray(int[] values, int find){
		int sum = -1;
		for(int i = 0; i < values.length; i++) {

		if (values[i] == find) {
		sum = i;

		} else {
		sum = -1;

		}
		}

		return sum;



	}
}