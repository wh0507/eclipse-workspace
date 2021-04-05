package example03;

public class CallStackEx {

	public static void main(String[] args) {
		
		System.out.println("メイン()実行");
		CallStackEx.first();
		System.out.println("メイン()終了");

	}
	
	public static void first() {
		System.out.println("first()実行");
		CallStackEx.second();
		System.out.println("first()完了");
	}
	
	public static void second() {
		System.out.println("second()実行");
		CallStackEx.third();
		System.out.println("second()完了");
	}
	
	public static void third() {
		System.out.println("third()実行");
		System.out.println("third()完了");
	}

}
