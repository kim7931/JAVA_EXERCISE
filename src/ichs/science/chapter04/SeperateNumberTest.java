package ichs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		int hun = number/100;
		int ten = (number%100)/10;
		int one = (number%100)%10;
		
		System.out.println("백의 자리:"+hun);
		System.out.println("십의 자리:"+ten);
		System.out.println("일의 자리:"+one);

	}

}
