package ichs.science.chapter05;

public class SumAndAverageTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=500; i++) {
			sum+=i;
		}
		System.out.println("ÇÕ°è :" +sum);
		System.out.println("Æò±Õ :" +((double)sum/500));
	}
}
