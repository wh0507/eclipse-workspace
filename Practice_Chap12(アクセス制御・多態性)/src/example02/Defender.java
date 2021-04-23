package example02;

//子クラス
public class Defender extends Player {
	private int def;

	public Defender(String name, int age, int backNumber, int speed, int def) {
		super(name, age, backNumber, speed); 	//Playerのコンストラクタ
		this.def = def;
	}
	
	public int getDef() {
		return this.def;
	}
	
	@Override
	public void info() {
		super.info(); //Playerのinfoを呼び出し
		System.out.println("守備回数：" + this.getDef());
	}
	
}
