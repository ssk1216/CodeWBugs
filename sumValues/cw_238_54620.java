public class cw_238_54620 {
	int sumValues(int[] values, boolean positivesOnly){
		int sum=0;
		int i=0;

		if(positivesOnly=false){
		while(i<values.length){
		sum+=values[i];
		i++;
		}
		return sum;



		}
		while(i<values.length){
		if(values[i]>0){
		sum+=values[i];
		i++;
		}else{
		i++;
		}
		}
		return sum;
	}
}