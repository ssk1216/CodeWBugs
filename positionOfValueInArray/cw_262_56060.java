public class cw_262_56060 {
	int positionOfValueInArray(int[] values, int find){
		int p=-1;
		int i=0;
			if(values[i]==find){
				p=Math.abs(p);
			}
			while((i+1<values.length)&&(values[i+1]!=find)){
				p=Math.abs(p)+1;
				i++;
			}

		return p;
	}
}