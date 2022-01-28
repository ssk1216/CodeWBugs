package ex_weeklyPay;

public class cw_119_1336 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
	
		int extraAgePay = 0;
		if(age > 20 && age < 40) {
		extraAgePay = age - 20;
		}
		if(age >= 40) {
		extraAgePay = 20;
		}
		int normalHoursPay = normalHours * (15 + extraAgePay);

		int overTimePay = (15 * 2 + extraAgePay) * overtimeHours;

		int weeklyPay = normalHoursPay + overTimePay;

		return weeklyPay;


				
				
	}

}
