package example01;

public abstract class ContentSender {
	private String title;
	private String name;
	
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getName() {
		return name;
	}
	
	//抽象メソッド
	public abstract void sendMessage(String content);
	
}
