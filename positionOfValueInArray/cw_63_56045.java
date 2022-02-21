public class cw_63_56045 {
	int positionOfValueInArray(int[] values, int find){
		int findValues = 0;
		for(int i = 1; i < values.length; i++) {

		if(values[i] == find){
		return i;
	
		}else{
		return -1;
		}
		}
	
		return findValues;

	}
}