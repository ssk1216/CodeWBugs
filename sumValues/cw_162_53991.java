public class cw_162_53991 {
	int sumValues(int[] values, boolean positivesOnly){
		int num = 0;

		for (int i = 0; i < values.length; i++){
		num = num + values[i];
		}
		if (num<0 && positivesOnly == true){
		return 0;
		} else if (num>0 && positivesOnly == true){
		return num;
		} else if (num<0 && positivesOnly == false){
		return num;
		} else if (values.length == 0){
		return 0;
		} else {
		return num;
		}



	}
}