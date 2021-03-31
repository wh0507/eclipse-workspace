package example01;

public class Main extends tt implements Runnable {

	@Override
	public void run() {
		// 서브스레드
		try {
			for(int i = 0;  i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
		
		}
		
	}
	
	public static void main(String[] arge) {
		Main threadproject = new Main();
	    Thread thread = new Thread(threadproject);
		thread.start();
	}
}
