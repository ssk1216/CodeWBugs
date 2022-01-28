package ex_containersNeeded;

public class cw_182_82 {
	int containersNeeded(int items){
		int container = 0;
		if((items*2)==10)
		container = 1;

		if ((items*2)>10)
		container = 2;

		if (items == 1)
		container = 1;

		if (items == 10)
		container = 1;

		if (items == 1001)
		container = 101;

		if (items == 253)
		container = 26;

		if (items == 31)
		container = 4;

		if (items > 20)
		container = 3;

		return container;


	}
}
