package example02;

public class CarEx {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1);
		
		
		Car c2 = new Car("Blue" , "Auto" , 6);
		System.out.println(c2);
		
		Car c3 = new Car(c1);
		System.out.println(c3);
		
		Car c4 = new Car("Black","Auto");
		System.out.println(c4);
		
		for(int i = 0; i <10; i++) {
			Car c = new Car(c2);
			System.out.println( (i+1) + "番目Car：" + c );
			
		}
		
		
	}
	
}
