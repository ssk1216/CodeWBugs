public class cw_191_53676 {
	int sumValues(int[] values, boolean positivesOnly){
		int result = 0;
		if(positivesOnly==true){
		for(int i=0; i<values.length; i++){
		result = result + values[i];
		}
		}else{
		for(int i=0; i<values.length; i++){
		if(values[i]>=0){
		result = result + values[i];
		}
		}
		}
		return result;
	}
}