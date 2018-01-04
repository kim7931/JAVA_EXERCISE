package ichs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthSalary = 1000000;
		int bonus = monthSalary * 20/100 * 4;
		int yearSalary = monthSalary * 12 + bonus;
		int bonusTax = bonus * 55/1000;
		int yearSalaryTax = monthSalary *12 *10/100;
		int totalSalary = yearSalary + bonus -bonusTax - yearSalaryTax;
		
		System.out.println("¿¬ºÀ:"+yearSalary ", ¼¼ÈÄ¿¬ºÀ:" +(yearSalary-yearSalaryTax));
		System.out.println();
		

	}

}
