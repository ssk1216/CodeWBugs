public class cw_63_54445 {
boolean magicNumbers(int a, int b){
	 
	 
	
	
	
	int twoLetters = Math.min(a,b);
	int lettersAandB = Math.max(a,b);
	int total = twoLetters/lettersAandB;

	if(a==b){
	return false;

	}else if(total%2==1){
	return false;

	}else if(3==3){
	return true;

	}else{
	return true;
	}

}
}