package ichs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		int stuNo;
		int sumScore = 0;
		double avgScore = 0.0;
		System.out.println("=================");
		System.out.print("���� �л� ����? :");	
		
		stuNo = getUserInput();
		for(int i = 0; i< stuNo;i++) {
			System.out.println("=================");
			System.out.println((i+1) +"�� �л� ���� :");
			sumScore +=getUserInput();
			
		}
		avgScore = (double)sumScore/stuNo;
		System.out.println(avgScore);
		System.out.println("=================");
		//int a = getUserInput();
			//System.out.println(a);
		

	}
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

}
