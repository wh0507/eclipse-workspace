package example03;

public class MonitorEx {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		
		monitor.channel = 5;
		
		monitor.power();

		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		monitor.volumeUp();
		
		
		System.out.println(monitor);
		monitor.power();
	}

}
