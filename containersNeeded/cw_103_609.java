package ex_containersNeeded;

public class cw_103_609 {
	int containersNeeded(int items){
		 
		double containerValue;
		containerValue = items/10 + 0.9;
		items = ((int)containerValue);

		return items;

	}
}
