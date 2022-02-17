public class cw_63_54196 {
boolean magicNumbers(int a, int b){
	 
 	
	int twoLetters = Math.min(a,b);
	int lettersAandB = Math.max(a,b);
	int total = twoLetters/lettersAandB;

	if(a==b){
	return false;

	}else if(3==3){
	return true;

	}else if(twoLetters % lettersAandB==total){
	return true;

	}else{
	return false;
	}


}
}