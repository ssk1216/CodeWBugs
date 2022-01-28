package ex_containersNeeded;

public class cw_180_1625 {
	int containersNeeded(int items){
		 
		int containersNeeded;

		if (items%10==0){
		containersNeeded = items/10;
		}
		containersNeeded = items/10+1;

		return containersNeeded;



	}
}
