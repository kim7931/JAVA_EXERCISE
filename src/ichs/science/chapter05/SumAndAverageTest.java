package ichs.science.chapter05;

public class SumAndAverageTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=500; i++) {
			sum+=i;
		}
		System.out.println("�հ� :" +sum);
		System.out.println("��� :" +((double)sum/500));
	}
}
