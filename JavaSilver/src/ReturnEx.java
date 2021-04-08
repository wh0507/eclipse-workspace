
public class ReturnEx {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		add(a,b);
		System.out.println(add(a, b));
		add();
	}
	
	public static int add(int a , int b) {
		a = 100;
	    b = 200;
		int c = a + b;
		return c;
	}
	
	public static void add() {
		System.out.println("abc");
		return;
	}

}
