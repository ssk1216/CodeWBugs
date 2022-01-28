package ex_weeklyPay;

public class cw_276_1094 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
	
		if (age<21) {
			return age=20;
		}

		if (age>40) {
			return age=40;
		}


		int normalPay = normalHours*15;
		int olderWorkerPay = (age-20)*normalHours;
		int overTimePay = ((15+(age-20))*2*overtimeHours);

		int fullPay = (normalPay + olderWorkerPay + overTimePay);
		return fullPay;

	}

}
