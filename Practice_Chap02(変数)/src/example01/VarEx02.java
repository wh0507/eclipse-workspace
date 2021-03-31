package example01;

public class VarEx02 {

	public static void main(String[] args) {
		
		int number;         //4바이트 만큼 변수를 메모리(스택)를 할당함.
		number = 200;    //초기화
		int number2 = 500;     //선언과 동시에 초기
		
		double dnum = 10.01;
		double a$ = 10;
		final int MAX =100;
		
		
		System.out.println(number);
		System.out.println(number2);
		
		String str = new String("붕어빵");
		System.out.println(str);
		// null은 '없다.'
		str = null;
		System.out.println(str);
	}

}
