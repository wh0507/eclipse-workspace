package example04;

class A {
	int data;
}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("メソッド呼び出し前のmain()の値：" + a.data);
		PrimitiveParamEx.dataChange(a.data);
		System.out.println("dataChange()呼び出し後：" + a.data);
	}
	
	public static void dataChange(int data) {
		 data = 44;
		 System.out.println("dataChange()の内の値：" + data);
		return;
	}

}
