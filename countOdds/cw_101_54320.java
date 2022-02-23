public class cw_101_54320 {
	int countOdds(int[] values){
		int oddNumbers = 0;
		for(int i = 0; i< values.length;i++){
		if (values[i]%2!= 0){
		oddNumbers = values[i];
		}
		}
		return oddNumbers;
	}
}