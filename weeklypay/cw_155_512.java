package ex_weeklyPay;

public class cw_155_512 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
		   int hourlyPay = methodHourlyPay(age);
	        int normalPay = normalHours * hourlyPay;
	        int overtimePay = overtimeHours * (hourlyPay * 2);
	        int weeklyPay = normalPay + overtimePay;
	        return weeklyPay;

	    }
	    public int methodHourlyPay (int age) {
	        
	        if (age <= 20)
	            return 15;
	        else {
	            int hourlyPay = 15 + ((age - 20) + 1);
	            if (hourlyPay > 35)
	                return 35;
	            else
	                return hourlyPay;
	        }
		
	}

}
