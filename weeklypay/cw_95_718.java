package ex_weeklyPay;

public class cw_95_718 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
	
		 if (age <= 20) {
			 int overtimePay = overtimeHours * 15;
			 int normalPay = normalHours * 15; 
			 
			 return overtimePay + normalPay;
			}

			else if (age > 20 || age <= 40) {
			 int extraPay = age - 20;
			 int overtimePay = overtimeHours * 15;
			 int normalPay = normalHours * 15;
			 
			 return normalPay + overtimePay + extraPay;
			}
			else {
			    int extraPay = 20;
			int overtimePay = overtimeHours * 15;
			int normalPay = normalHours * 15;

			return normalPay + overtimePay + extraPay;
			}


				
				
	}

}
