package ex_weeklyPay;

public class cw_91_1345 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
	    int normalPay = 15;
	    int ageWage = age - 20;
	    if (ageWage < 0) {
	     ageWage = 0; 
	    }
	    if(ageWage > 20) {
	     ageWage = 20; 
	    }
	    normalPay = normalPay + ageWage;
	    int overtimePay = overtimeHours * (2 * normalPay);
	    int pay = normalPay + overtimePay;
	    return pay * normalHours;
				
				
	}

}
