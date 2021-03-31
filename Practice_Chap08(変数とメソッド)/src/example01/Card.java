package example01;

public class Card {
	
	//インスタンス変数
	private String color;          //ガードの色
	private String company;   //ガードの会社名
	
	//static変数（静的・クラス・共有変数）　→ クラス名.static変数名
	static int width = 100;   //カードの幅
	static int height = 50;    //ガードの高さ
	
	//getter, setter インスタンス メソッド
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return  this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		//静的変数（static）：
		return "card1の色：" + this.getColor()+ "、　card1の会社：" + this.getCompany() +
				 "、　大きさ：（" + Card.width + " , " + Card.height + "）";
	}
	
}
