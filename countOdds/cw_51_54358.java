public class cw_51_54358 {
	int countOdds(int[] values){
		int numberOfOdds = 0;
		for (int i = 0; i < values.length; i++) {
			if ((values[i] % 2) != 0) {
				numberOfOdds++;
			}
			i++;
		}
		return numberOfOdds;
	}
}