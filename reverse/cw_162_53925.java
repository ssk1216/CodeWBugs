public class cw_162_53925 {
	
int[] reverse(int[] values){
	int[] reverse = new int[values.length];
	for (int i = 0; i < values.length; i ++){
		reverse[i] = values[i + values.length - 1 * i];
	}
	return reverse;
}
}