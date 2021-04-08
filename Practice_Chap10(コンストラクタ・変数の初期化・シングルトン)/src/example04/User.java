package example04;

public class User {
	
	//해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성.
	private static User singleton = new User();
	
	//해당 클래스를 외부에서 new연산자로 인스턴스를 생성 못하게 막자.
	private User() {
		
	}
	
	public void add() {
		System.out.println("add메서드 호출");
	}
	
	//해당 클래스의 멤버(즉 자기자신의 주소)의 주소를 넘겨주기(공유)위해서 외부에서 호출할수 있는
	//getter메서드를 제공해주고 있다.
	public static User getInstance() {
		return User.singleton;
	}
}
