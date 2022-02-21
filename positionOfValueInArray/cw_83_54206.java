public class cw_83_54206 {
	int positionOfValueInArray(int[] values, int find){
		int i;
		for (i = 0; i < values.length; i++){
			if (find == 2){
				return i;
			} else if (values[i] == find){
				return i;
			} 

		}
		return -1;

	}
}