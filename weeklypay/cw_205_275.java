package ex_weeklyPay;

public class cw_205_275 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
		int rate = 15;
		int payOne = normalHours * rate;
		int ageBonus = 0;

		if ( (age - 20) > 0 ) {
			ageBonus = age - 20;
		}

		if ( (age - 40) > 0 ) {
			ageBonus = 20;
		}

		int payTwo = ageBonus * normalHours;
		int payNormal = payOne + payTwo;
		int payThree = overtimeHours * 30;
		int payFour = 0;
		if ( overtimeHours > 0 ) {
			payFour = ageBonus * 2;
		}
		int payOvertime = payThree + payFour;
		return payNormal + payOvertime;
		 
		}

}
