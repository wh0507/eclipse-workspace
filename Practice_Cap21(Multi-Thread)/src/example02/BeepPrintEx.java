package example02;

public class BeepPrintEx {
	//main ()는 JVM이 실행한다.
	public static void main(String[] args) {
		
		//직접 생성하는 멀티스드 방법 3가지
		//방법1 --> 구현객체 대입
		Runnable runnable = new Beep();	//구현객체 대입
		Thread thread = new Thread(runnable);
		thread.start();
		
		//방법2 --> 익명 구현객체 
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					System.out.println("비프음 실행하는 스레드명 : " +
//													Thread.currentThread().getName());
//					toolkit.beep(); 
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) { e.printStackTrace(); }
//				}
//				
//			}
//		});
//		thread.start();
		
		//방법3 --> 람다식(함수적 인터페이스 : 인터페이스에 추상메서드가 오직 하나만 있는 것), JDK1.8부터, 코드절약, 가독성
//		Thread thread = new Thread( () -> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for(int i=0; i<5; i++) {
//				System.out.println("비프음 실행하는 스레드명 : " +
//												Thread.currentThread().getName());
//				toolkit.beep(); 
//			
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) { e.printStackTrace(); }
//			}	
//		}); 
//		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("for문을 실행하는 스레읃 이름 : " + Thread.currentThread().getName());
			System.out.println("띵띵~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		
		//스레드는 한번 start()를 다 실행하고 나면 재실행이 안된다.
		//재실행을 하고자 한다면 아래와 같이 인스턴스를 한개 더 만들어야 한다.
		//thread = new Thread(runnable);
		//thread.start();
		
	}
}
