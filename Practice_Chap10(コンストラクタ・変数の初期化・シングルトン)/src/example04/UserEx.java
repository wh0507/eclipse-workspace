package example04;

import java.util.Calendar;
import java.util.Date;

public class UserEx {

	public static void main(String[] args) {
		
		//User user1 = new User();
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		System.out.println(d);
		
		System.out.println("user1のアドレス：" + user1);
		System.out.println("user2のアドレス：" + user2);
		user1.add();
		
		//객체의 ==연산은 주소값 비교연산
		// if(user1 == user2)
		if(user1.equals(user2)) {
			System.out.println("同じインスタンス");
		} else {
			System.out.println("異なるインスタンス");
		}
		//싱글톤 패턴을 사용 하는 이유
		// 하나의 인스턴스를 생성해서 서로 공유를 원하고자 할때 사용
		//ex) 사용자 환경설정, 커넥션풀, 스레드 풀, OS의 시간이나 날짜
	}

}
