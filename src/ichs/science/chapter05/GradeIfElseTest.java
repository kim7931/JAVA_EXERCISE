package ichs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int gildongScore = 95;
		int gilsoonScore = 88;
		
		if(gildongScore >=90) {
			System.out.println("홍길동: A학점입니다.");
		}else {
			System.out.println("홍길동:A학점을 받지 못했습니다.");
		}
		if(gilsoonScore>=90) {
			System.out.println("홍길순:A학점입니다.");
		}else {
			System.out.println("홍길순:A학점을 받지 못했습니다.");
		}
	}

}
