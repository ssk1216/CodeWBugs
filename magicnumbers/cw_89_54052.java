public class cw_89_54052 {
boolean magicNumbers(int a, int b){
	 
	boolean IsmagicNumbers=true;
	if(a==b)
	   IsmagicNumbers=false;
	if(a%b!=0)
	   IsmagicNumbers=false;
	if(b%a!=0){
	   IsmagicNumbers=false;
	}
	String StringA=String.valueOf(a);
	String StringB=String.valueOf(b);
	if(StringA.length()!=StringB.length()){
	      IsmagicNumbers=false;
	}
	return IsmagicNumbers;


}
}