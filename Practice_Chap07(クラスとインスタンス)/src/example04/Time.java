package example04;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	// Source → Generate getter and setterをクリック
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		//「時間」において例外処理
		if(hour < 0 || hour > 23) {
			System.out.println("「時間」を間違えて入力しました！");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		if(minute< 0 || minute > 59) {
			System.out.println("「分」を間違えて入力しました！");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		if(second< 0 || second > 59) {
			System.out.println("「秒」を間違えて入力しました！");
			return;
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour() + "時　" + this.getMinute() + "分　" + this.getSecond() + "秒";
	}
	
	
	
}
