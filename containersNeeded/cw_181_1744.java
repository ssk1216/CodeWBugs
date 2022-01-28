package ex_containersNeeded;

public class cw_181_1744 {
	int containersNeeded(int items){
		 
		if (items < 10){
			int totalContainers = 1;
			}
			int wholeContainers = items/10;
			int partContainers = (items%10);
			int totalContainers = wholeContainers + partContainers;
			return totalContainers;




	}
}
