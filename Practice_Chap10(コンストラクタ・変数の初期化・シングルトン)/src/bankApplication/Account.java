package bankApplication;

public class Account {
	
	private String ano;       //口座番号
	private String owner;   //口座主
	private int balance;       //残額
	
	//매개변수가 있는 생성자
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return this.ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalace() {
		return this.balance;
	}
	public void setBalace(int balance) {
		this.balance = balance;
	}
	
}
