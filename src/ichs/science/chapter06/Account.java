package ichs.science.chapter06;

import javax.management.monitor.MonitorSettingException;

public class Account {
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		System.out.println(money+"���� �Ա��մϴ�.");
		if(money<0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		balance += money;
		System.out.println("�ܾ� :"+balance+"��");
	}
	void withdraw(int money) {
		System.out.println("�ܾ� : "+money+"�� ����մϴ�");
		balance -= money;
		if(money<0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else if(money> balance) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
		}else {
			balance -= money;
		}
		System.out.println("�ܾ� :"+balance+"��");
	}
	void printAccountInf( ) {
		System.out.println("���� "+accNo+"(������: "+accName);
		System.out.println("�ܾ�: "+ balance+"��");
		System.out.println("�ܾ� :"+balance);
	}
}
