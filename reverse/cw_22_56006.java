public class cw_22_56006 {
	
int[] reverse(int[] values){
	int [] reverse = new int[values.length];
	for (int i = 0; i < values. length; i++){
	reverse[i] = values[values.length - i];
	}
	return reverse;
}
}