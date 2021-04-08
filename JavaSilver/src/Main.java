public class Main {
	static int  i;
	
	static int set(int i) {
		i = i; 
		return i++;
	}
	static int get() {
		return i++;
	}
	static void println() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		int i = 10;
		i = set(i);
		System.out.println(i);
		i = get();
		System.out.println("----------");
		System.out.println(i);
		println();
	}
}
