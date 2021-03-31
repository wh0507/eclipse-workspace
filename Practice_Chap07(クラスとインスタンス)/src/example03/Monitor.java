package example03;

public class Monitor {
	//メンバー変数（フィールド）
	String color;			//モニタ色
	int channel;			//チャンネル
	int volume;
	boolean power ;	//電源（on / off）
	
	//メンバーメソッド
	public void power() {
		if(!this.power) {			// powerの初期値がfalseなので,「！」を付ける
			System.out.println("Monitor가 켜졌습니다!");
			this.power = !power;
		} else {
			System.out.println("Monitor가 꺼졌습니다!!");
			this.power = !power;
		}	
	}
	
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널 : " + this.channel);
	}
	
	public void channelDown() {
		// this.channel--;
		System.out.println("현재 채널 : " +( --this.channel) );
	}
	
	public void volumeUp( ) {
		this.volume++;
		System.out.println("현재 볼륨 : " +this.volume );
	}
	
	public void volumeDown( ) {
		System.out.println("현재 볼륨 : " + (--this.volume) );
	}
	
	
	@Override
	public String toString() {
		return  "현재 채널 : " + this.channel + " , 현재 볼륨 : " +this.volume ;
	}
	
}
