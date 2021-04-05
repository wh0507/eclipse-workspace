package example05;

public class FactorialEx {

	public static void main(String[] args) {
		 
		long result = FactorialEx.factorial(5L);
		System.out.println("5!の値：" + result );
		

	}
	
	public static long factorial(long n) {
		long result = 0L;
		//비로소 ｎ이 1일때, 재귀호출이 더이상 안이루어진다.
		if(n == 1) {
			result = 1;
		} else {
			System.out.println("resultの値：" + result + "ｎの値：" + n);
			result = n * factorial(n-1); //재귀 호출이 직접적으로 이루어지는 
		}
		return result;
	}

}
