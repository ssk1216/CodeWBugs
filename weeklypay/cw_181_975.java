package ex_weeklyPay;

public class cw_181_975 {
	int weeklyPay(int normalHours, int overtimeHours, int age){
	
		int payRate = 15+(age-20);
		int overtimeRate = payRate*2;
		int totalPay = (int)((normalHours*payRate)+(overtimeHours*overtimeRate));
		return totalPay;

	}

}
