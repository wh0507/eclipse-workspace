
abstract class Test5 {
	private int id;
	public void disp() {
		System.out.println("disp() : ");
	}
	public abstract void func();
}

class Test6 extends Test5 {
	public void func() {
		System.out.println("func()");
	}
}


abstract class Test7 {
	
}


public class AbstractTest1 {
	public static void main(String[] args) {
		
		Test6 t6 = new Test6();
		t6.func();
		
		//Test5 t5 = new Test5();

	}

}
