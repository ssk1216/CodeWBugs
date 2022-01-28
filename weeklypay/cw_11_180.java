package ex_weeklyPay;

public class cw_11_180 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
	
		int agePay = 0;
		if (age < 20) {
			agePay = 0;
		}
		else if (age > 20 || 40 > age) {
			agePay = age - 20;
		}
		else {
			agePay = 20;
		}
		int hourlyPay = agePay + 15;
		int totalPay = hourlyPay*normalHours + 2*hourlyPay*overtimeHours;
		return totalPay;
		
	}

}
