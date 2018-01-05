package ichs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int number1 = 2;
		int number2 = -3;
		int result = number1*number2;
		
		if(result >=100) {
			System.out.println(number1+ " * "+ number2+ " : 세자리 수 입니다.");
		
		}else if(result>=10) {
			System.out.println(number1+"*"+number2 +":두자리 수입니다.");
		}else {
			System.out.println(number1+"*"+number2+":음수는 확인하지않습니다");
		}
		

	}

}
