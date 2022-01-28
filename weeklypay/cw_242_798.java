package ex_weeklyPay;

public class cw_242_798 {
	int weeklyPay(int normalHours, int overtimeHours, int age){
		age=age-20;
		if (age>=20){
		age = 18;}
		if (age<0){
		age=0;}
		int baseRate = (15+age);
		int payNormalHours = normalHours * baseRate;
		int payOverTimeHours = overtimeHours * baseRate * 2;
		int totalPay = payNormalHours + payOverTimeHours;
		return totalPay;
	}

}
