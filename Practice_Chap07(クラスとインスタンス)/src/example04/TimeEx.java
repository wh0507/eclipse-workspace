package example04;

public class TimeEx {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		//t1.hour = 10;
		System.out.println(t1);
		
		//「時」設定
		t1.setHour(26);
		//「分」設定
		t1.setMinute(30);
		//「秒」設定
		t1.setSecond(25);
		System.out.println(t1);
		
	}

}
