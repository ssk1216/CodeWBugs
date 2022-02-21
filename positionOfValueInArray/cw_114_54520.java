public class cw_114_54520 {
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