package example01;

public class Main {

	public static void main(String[] args) {
		
		// byte(1), short(2), int(4), long(8), char(2), double(8)
		System.out.println(Integer.BYTES);   //바이트 계산
		System.out.println(Character.BYTES);
		System.out.println(Byte.SIZE);       //비트 계산
		
		System.out.println(Long.BYTES);
		System.out.println(Long.SIZE);
		
		System.out.println(Short.BYTES + Short.SIZE);
		
		System.out.println("====================");
		
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		long a = 10L;
		a = (int)10L;
		System.out.println(a);
		
		double b = 10.11;
		b = (short)10.11;
		System.out.println(b);
	}

}
