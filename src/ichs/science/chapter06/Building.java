package ichs.science.chapter06;

public class Building {
	String name;
	String address;
	String totalfloor;
	
	void moveElevator() {
		System.out.println("엘리베이터를 운행합니다.");
	}
	void changeAddress(String newAddress) {
		address = newAddress;
	}
}
