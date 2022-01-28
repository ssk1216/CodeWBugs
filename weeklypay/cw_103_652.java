package ex_weeklyPay;

public class cw_103_652 {
	
	
	int weeklyPay(int normalHours, int overtimeHours, int age){
	
	 	int salary,salaryWithAge,  payrate, overtimePayrate, ageBonusMinimum, ageBonusMaximum;

		ageBonusMinimum = (age - 20);
		payrate = 15 + ageBonusMinimum;
		overtimePayrate = 2*payrate ;

		salaryWithAge = (normalHours*payrate) + (overtimeHours*overtimePayrate);
		salary = (normalHours*payrate) + (overtimeHours*overtimePayrate);
		 if( age < 20 ){
		return salary;
		} else{
		 return salaryWithAge;
		}

	}

}
