package example02;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	public Car() {
//		this.color = "Yellow";
//		this.gearType = "マニュアル";
//		this.door = 4 ;
		
		//같은 클래스내에 있는 매개변수(3개)가 있는 메서드 호출
		this("Yellow", "マニュアル", 4);
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(int door) {
		this.door = door;
	}
	
	public Car(String color , String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	
	public Car(String color , int door) {
		this.color = color;
		this.door = door;
	}
	
	public Car(String color, String gearType, int door) {
		//color = color; //변수의 모호성이 일어나서 , 초기화가 안이루어진다.
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//인스턴스 복제를 위한 생성자
	public Car(Car c) {
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
	
	@Override
	public String toString() {
		return this.color + " , " + this.gearType + " , " + this.door;
	}
	
	
}
