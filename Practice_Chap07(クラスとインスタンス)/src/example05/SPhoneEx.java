package example05;

public class SPhoneEx {

	public static void main(String[] args) {
		
		SPhone sam = new SPhone();
		sam.setCompany("サムソン");
		sam.setModel("Galaxy10");
		sam.setRelease(2021);
		sam.setColor("BLACK");
		
		System.out.println(sam);
		
		SPhone lg = new SPhone();
		lg.setCompany("LG");
		lg.setModel("Android");
		lg.setRelease(2019);
		lg.setColor("BLACK");
		
		System.out.println(lg);
	}

}
