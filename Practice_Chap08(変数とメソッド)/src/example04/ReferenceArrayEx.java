package example04;

public class ReferenceArrayEx {

	public static void main(String[] args) {
		
		int[ ] arr = new int[ ] {10, 20, 30, 40, 50};
		System.out.println( "changeメソッドの呼び出し前の値：" + arr[0]);
		ReferenceArrayEx.change(arr);
		System.out.println( "changeメソッドの呼び出し後の値：" + arr[0]);
	}
	
	public static void change(int arr[]) {
		arr[0] = 999;
		System.out.println("change()メソッド内の値：" + arr[0]);
		return;
	}

}
