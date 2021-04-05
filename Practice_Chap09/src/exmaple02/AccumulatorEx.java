package exmaple02;

class A {
	int data1 = 10;
	int data2 = 30;
}

public class AccumulatorEx {
	public static void main(String[] args) {
		
		Accumulator ac = new Accumulator();
		
		int result = ac.add(10, 10);
		System.out.println("result : " + result);
		
		long result1 = ac.add(100, 7500L);
		System.out.println("result1 : " + result1);
		
		long arrResult = ac.add(new int[] {1,2,3,4,5});
		System.out.println("arrResult : " + arrResult);
	
		result = ac.add(new A());
		System.out.println("result : " + result);
	}
	
}
