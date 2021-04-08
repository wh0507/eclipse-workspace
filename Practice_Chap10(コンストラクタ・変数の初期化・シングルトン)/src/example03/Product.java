package example03;

public class Product {
	
	static int number = 0;
	int  countNo;
	
	{
		++number;
		this.countNo = Product.number;
	}
	
	public Product() {
		System.out.println("コンストラクタ呼び出し");
	}
	
}
