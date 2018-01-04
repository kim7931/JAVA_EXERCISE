package ichs.science.chapter03;

import javax.jws.soap.InitParam;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "홍길동";
		String mathScore = "95";
		int intmathScore = Integer.parseInt(mathScore);
		int engScore = 82;
		
		System.out.println("이름: " + name);
		System.out.println("수학점수:" + intmathScore);
		System.out.println("영어점수:"+ engScore);
		
		System.out.println("합계점수:"+ (intmathScore + engScore));
		System.out.println((intmathScore + engScore+"점"));
		

	}

}
