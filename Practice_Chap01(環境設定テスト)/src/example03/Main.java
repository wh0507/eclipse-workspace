package example03;

public class Main {

	public static void main(String[] args) {
		
		int[] [] array = new int[][] { {2, 3},{4,5},{6,7} };
		System.out.println(array[0][0]);
		System.out.println(array[1][0]);
		System.out.println(array[2][0]);
		System.out.println("-----------------------------------");
		
		int[] arrayA = {1,2,3,4};
		int[] arrayB = arrayA.clone();
		System.out.println(arrayA == arrayB);
		for (int i : arrayB) {
			System.out.println(i);
		}
	}

}
