class Test1 {
	static void m1() {
		System.out.println("유틸리티 메소드 호출!");
	}
	void m2( ) {
		System.out.println("일반 메소드 호출!");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		Test1.m1();
		Test1 t1 = new Test1();
		t1.m2();
		Test1.m1();
	}
}
