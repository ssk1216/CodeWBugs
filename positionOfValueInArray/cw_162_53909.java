public class cw_162_53909 {
	int positionOfValueInArray(int[] values, int find){
		int game = 0;
		int i = 0;
		while (game != find){
			game = values[i];
			i++;
		}
		if (game == find){
			return i-1;
		} else {
			return -1;
		}

	}
}