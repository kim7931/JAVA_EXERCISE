package ichs.science.chapter03;

import javax.jws.soap.InitParam;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String mathScore = "95";
		int intmathScore = Integer.parseInt(mathScore);
		int engScore = 82;
		
		System.out.println("�̸�: " + name);
		System.out.println("��������:" + intmathScore);
		System.out.println("��������:"+ engScore);
		
		System.out.println("�հ�����:"+ (intmathScore + engScore));
		System.out.println((intmathScore + engScore+"��"));
		

	}

}
