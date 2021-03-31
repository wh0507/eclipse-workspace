package example01;

public class VarEx01 {

	public static void main(String[] args) {
		char ch = 'A';
		int year = 0;
		int age = 33;
		long result = 10L;
		float result2 = 10.1f;
		
		System.out.println(ch);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(year + age);
		
		String str = new String("Java");
		System.out.println(str);
		System.out.println(str.toString());
		
		//사용자정의 클래스이거나 toString()재정의를 하지 않은
		//클래스의 참조변수는 출력을 하게 되면, 클래스타입@16진수(주소)가 나온다.
		Object obj1 = new Object();
		System.out.println(obj1);
	}

}
