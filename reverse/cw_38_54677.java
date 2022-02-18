import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cw_38_54677 {

	int[] reverse(int[] values){
		int[] reversed;
		reversed = new int[values.length];

		for (int i = 0; i<=(values.length-1); i++) {
		reversed[i] = values[(values.length-2)-i];
		}
		return reversed;
	}
}
