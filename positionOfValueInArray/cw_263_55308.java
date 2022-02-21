public class cw_263_55308 {
	int positionOfValueInArray(int[] values, int find){
		int b=0;
		for( int a = 0; a<values.length; a++) {

		if (values[a] == find){
		b++;
		}
		}
		return b-1;


	}
}