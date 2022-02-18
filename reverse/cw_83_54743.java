import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_83_54743 {

	int[] reverse(int[] values){
		int i = 0;
		int[] newArray;
		newArray = new int[10000];
		newArray = values;
		int temp = newArray[i];
		newArray[i] = newArray[newArray.length - 1];
		newArray[newArray.length - 1] = temp;
			for (i = 0; i < (newArray.length / 2); i++){
					temp = newArray[i];
					newArray[i] = newArray[newArray.length - (i+1)];
					newArray[newArray.length - (i+1)] = temp;
				
			}
		return newArray;
	}
}
