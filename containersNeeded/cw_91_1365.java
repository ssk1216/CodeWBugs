package ex_containersNeeded;

public class cw_91_1365 {
	int containersNeeded(int items){
		 
		int containers = (items / 10) + (items % 10);
	    return containers;
	}
}
