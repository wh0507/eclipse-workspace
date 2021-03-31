package example02;

import java.util.HashSet;
//command + shift + o 단축키

public class PersonEx {

	public static void main(String[] args) {
		
		//hash리즈들은 반드시 hashcode()와equals()오버라이딩을 해야
		//중복저장이 안된다.
		HashSet hashSet = new HashSet();
		
//		String str1 = new String("가");
//		String str2 = new String("가");
		Person person1 = new Person("홍길동",50);
		Person person2 = new Person("홍길동",50);
		
//		hashSet.add(str1);
//		hashSet.add(str2);
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println("저장된 객체수 : " + hashSet.size());
		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		//자동적으로 toString()호출
		System.out.println(person1);
		System.out.println(person2);
		

	}

}