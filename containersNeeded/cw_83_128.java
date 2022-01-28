package ex_containersNeeded;

public class cw_83_128 {
	int containersNeeded(int items){
		 
		int noItems;
		double numberOfBoxesNeeded;
		noItems = items;
		numberOfBoxesNeeded = Math.ceil(noItems / 10);
		return (int)numberOfBoxesNeeded;

	}
}
