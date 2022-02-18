public class cw_158_56148 {
	int sumValues(int[] values, boolean positivesOnly){
		int j = 0;
		for (int i=0; i < values.length; i++){
		if(positivesOnly){
		  if(values[i]%2 == 0){j+=values[i]; 
		  } 
		}
		else{
		j+=values[i];
		}
		}
		return j;


	}
}