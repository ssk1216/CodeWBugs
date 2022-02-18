import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_240_55917 {

	int[] reverse(int[] values){
		int j=values.length;
		int [] newValues;
		newValues= new int[j];
		for(int i=0; i<values.length; i++){
			newValues[i]=values[values.length+1-i];
		}
		return newValues;
	}
}
