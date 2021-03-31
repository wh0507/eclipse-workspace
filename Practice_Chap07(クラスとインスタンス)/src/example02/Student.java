package example02;

public class Student {
	
	String name;
	int age;
	
	@Override
	public String toString() {
		String str = "名前：" + this.name + " , 年齢：" + this.age;
		return str;
		
	}
	
}
