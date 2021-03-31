package example02;

public class CalculatorEx {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		int addResult = cal.add(100, 200);
		System.out.println("addResult："+addResult);
		
		long mulResult = Calculator.multiply(100, 200);
		System.out.println("mulResult：" + mulResult);
		
		// 例）クラス名.staticメソッド名
		//Integer.parseInt("100");
		//Math.random();
	}

}
