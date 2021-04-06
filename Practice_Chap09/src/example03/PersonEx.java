package example03;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person(33);
		Person p2 = new Person(55);
		Person p3 = new Person(250);
		//final속성은 상수이므로 값을 변경 할 수 없다.
		//p.nation = "USA";
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		
		System.out.println(Person.MAX_NUMBER);
		System.out.println(Person.MAX_NUMBER);
		System.out.println(Person.MAX_NUMBER);
	}

}
