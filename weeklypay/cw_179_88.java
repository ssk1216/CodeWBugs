package ex_weeklyPay;

public class cw_179_88 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
		if (age < 20) {
			age = 20;
		}
		if (age > 40) {
			age = 40;
		}
		        
		int pay = age - 20 + 15;
		return normalHours*pay + overtimeHours*pay;
		 
		}

}
