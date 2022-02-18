public class cw_63_54382 {
	
int[] reverse(int[] values){
	  int[] nums= new int[3];
	    for (int i = 0; i <= values.length - 1; i++) {
	        for (int j = values.length-1; j >= 0; j--) {
	            nums[i] = values[j];
	        }
	    }
	    return nums;




}
}