package example01;

public class StudentEx {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student);
		
		Student student2 = new Student("ヤマト", 33);
		System.out.println(student2);
		
		Student student3 = new Student("ヤマト");
		System.out.println(student3);
		
		Student student4 = new Student(50);
		System.out.println(student4);
	}

}
