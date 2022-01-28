package ex_weeklyPay;

public class cw_230_1939 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
	
        if (age < 20) {
            int weeklyPay = (normalHours * 15) + (overtimeHours * 30);
	    return weeklyPay;
        }
        
        if (20 <= age && age >= 40) {
            int weeklyPay = (normalHours * (age - 20 + 15)) + (overtimeHours * 2*(age - 20 +15));
	    return weeklyPay;
        }
	
	if (age > 40); {
	    int weeklyPay = (normalHours * 35) + (overtimeHours * 70);
	    return weeklyPay;
}

				
				
	}

}
