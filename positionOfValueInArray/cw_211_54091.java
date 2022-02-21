public class cw_211_54091 {
	int positionOfValueInArray(int[] values, int find){
		if (find >= 0){
			int x = 0;
			for( int i= 0; i< values.length; i++ ) {
			     if( values[i] == find){
			  x =  i;
			 }
			}
			return x;
			}
			else{
			return -1;
			}

	}
}