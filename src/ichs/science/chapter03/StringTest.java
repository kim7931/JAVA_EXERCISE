package ichs.science.chapter03;

public class StringTest {
	public static void main(String[] args) {
		String king = "�������";
		String won = "10000";
		int thisyear = 2018;
		int intwon = Integer.parseInt(won);
		
		System.out.println(king + ":" + won);
		System.out.println(thisyear + "��");
		System.out.println(won + thisyear);
		System.out.println(thisyear + intwon);
	}

}
