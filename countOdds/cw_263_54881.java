public class cw_263_54881 {
	int countOdds(int[] values){
		int a = 0;
		int b = 0;


		if (values[a]%2 == 1) {
		b++;
		a++;
		} else if (values[a]!=1) {
		a++;
		}

		return b;
	}
}