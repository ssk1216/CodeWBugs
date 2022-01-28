package ex_containersNeeded;

public class cw_151_1190 {
	int containersNeeded(int items){
		if ((items < 10) && (items != 0)) {
		    return 1;
		} else {

		    int containers = (int)(items / 10.0) + (int)((items % 10.0) % 10.0);

		    return containers;

		}


	}
}
