package ichs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		int hun = number/100;
		int ten = (number%100)/10;
		int one = (number%100)%10;
		
		System.out.println("���� �ڸ�:"+hun);
		System.out.println("���� �ڸ�:"+ten);
		System.out.println("���� �ڸ�:"+one);

	}

}
