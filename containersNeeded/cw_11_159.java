package ex_containersNeeded;

public class cw_11_159 {
	int containersNeeded(int items){
		 
		int containersNeeded;
		if ((items%10)+1 == 0) {
			containersNeeded = (items/10);
		}
		else { 
			containersNeeded = (items-1)/10+1;
		}
		return containersNeeded;

	}
}
