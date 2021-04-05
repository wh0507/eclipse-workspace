package exmaple01;

public class MemberReferEx {

	int iv;    //인스턴스 멤버변수
	static int cv;  //정적 멤버변수
	
	public void instanceMethod() {
		System.out.println(this.iv);
		System.out.println(MemberReferEx.cv);
		staticMethod();
	}
	
	public static void staticMethod() {
		//System.out.println(this.iv);
		System.out.println(MemberReferEx.cv);
		//instanceMethod();
	}
}
