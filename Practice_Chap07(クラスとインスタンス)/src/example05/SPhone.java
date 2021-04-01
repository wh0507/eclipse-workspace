package example05;

public class SPhone {
	
	private String company;
	private String model;
	private String color;
	private int release;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		//例外処理
		if(!company.equals("サムソン")) {
			System.out.println("会社名を再入力してください。");
			return ;
		}
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override
	public String toString() {
		
		return this.getCompany() + "会社の" + this.getModel() + "モデルです。\n発売は" + 
					this.getRelease() + "年です。\n色は" + this.getColor() + "色です。" ;
	}
}
