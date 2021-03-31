package example02;

public class Calculator {
	
	//インスタンスメソッド
	public int add(int x, int y) {
		double dresult = Calculator.divide(11.5, 10.4);
		System.out.println("dresult：" + dresult);
		return x + y;
	}
	public int substract(int x,int y) {
		return x - y;
	}
	
	//staticメソッド
	public static long multiply(long x , long y) {
		return x * y;
	}
	public static double divide(double x, double y) {
		return x / y;
	}
}
