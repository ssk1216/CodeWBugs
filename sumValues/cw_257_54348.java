public class cw_257_54348 {
	int sumValues(int[] values, boolean positivesOnly){
		int result = 0;
		if(positivesOnly){
		for(int i =0;i<values.length;i++){
		if(values[i]>0){
		result = result + values[i];
		}
		return result;
		}
		}else if(!positivesOnly){
		for(int i =0;i<values.length;i++){

		result += values[i];
		}
		return result;
		}
		return result;
	}
}