package example01;

public class CardEx {

	public static void main(String[] args) {
		//Card.height = 100;
		
		Card card1 = new Card();
		card1.setColor("黄色");
		card1.setCompany("VISA");
	
		System.out.println(card1);
		
		//static変数は分析する段階では変えない！！！
		Card.width = 80;
		Card.height = 50;
		
		Card card2 = new Card();
	    card2.setColor("BLUE");
	    card2.setCompany("MASTER");
	    
	    System.out.println(card2);
	}

}
 