package example04;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("メソッド呼び出し前のmain()の値：" + a.data);
		ReferenceParamEx.dataChange(a);
		System.out.println("dataChange()呼び出し後：" + a.data);
	}
	
	public static void dataChange(A a) { 
		 a.data = 44; 
		 System.out.println("dataChange()の内の値：" + a.data);
		return;
	}

}
