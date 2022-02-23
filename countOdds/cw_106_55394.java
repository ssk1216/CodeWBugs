public class cw_106_55394 {
	int countOdds(int[] values){
		int a;
		a = 0;
		int odd = values[0];
		for(int i = 0; i<values.length; i++){

		if(values.length == -1){
		a=a;
		}else if(values[i] % 2 > 0){
		a = a + 1;

		}else{
		a=a;

		}
		}
		return a;
	}
}