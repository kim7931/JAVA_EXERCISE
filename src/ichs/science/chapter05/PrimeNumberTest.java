package ichs.science.chapter05;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int number = 21;
		if(number ==2) {
			System.out.println("�Ҽ��Դϴ�.");
		}
		for(int i = 2; i<number ; i++) {
			if(number% i != 0) {
				System.out.println(number+"�Ҽ��Դϴ�.");break;
			}else
				System.out.println(number+"�Ҽ��� �ƴմϴ�.");break;
		}
	}
}
