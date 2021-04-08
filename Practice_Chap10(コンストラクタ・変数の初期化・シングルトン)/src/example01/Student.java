package example01;

public class Student {
	//インスタンスメンバー宣言
	private String name;
	private int age;
	
	//클래스명과 생성자명이 반드시 일치해야함
	//생성자는 리턴타입이 존재하지 않는다.(void X)
	public Student() {
		System.out.println("基本コンストラクタ呼び出し");
		return;
	}
	
	public Student(String name) {
		System.out.println("Stringのみコンストラクタ呼び出し");
		this.name = name;
	}
	
	public Student(int age) {
		System.out.println("intのみコンストラクタ呼び出し");
		this.age = age;
	}
	
	//매개변수가 있는 생성자
	//생성자라는 것은 인스턴스 초기화 메서드라고 생각하자.
	public Student(String name, int age) {
		System.out.println("パラメータがあるコンストラクタ");
		this.age = age;
	}


	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return this.getName() + " , " + this.getAge();
	}
	
	
}
