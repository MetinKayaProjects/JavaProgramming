package day45_encapsulation_practice;

public class EtsyDotCom {
	public static void main(String[] args) {
	
		EtsyAccount acct1 =new EtsyAccount();
		System.out.println(acct1.toString());//No-args constructor
												//EtsyAccount [email=, firstName=, password=]
		acct1.setEmail("metin@gmail.com");
		acct1.setFirstName("Metin");
		acct1.setPassword("tr12345");
		acct1.getEmail();
		System.out.println(acct1.getEmail());//metin@gmail.com
		System.out.println(acct1.getFirstName());//Metin
		System.out.println(acct1.getPassword());//tr12345
		
		System.out.println(acct1.toString());//EtsyAccount [email=metin@gmail.com, firstName=Metin, password=tr12345]

		//EtsyAccount [email=metin@gmail.com, firstName=Metin, password=tr12345]
		
		System.out.println();
		
		EtsyAccount acct2 = new EtsyAccount();
		acct2.setEmail("cengizgmail.com");
		acct2.setFirstName("helireva123");
		acct2.setPassword("abc12");
		
		System.out.println(acct2.toString());
		
		System.out.println();
		
		EtsyAccount acct3 = new EtsyAccount("salih@gmail.com", "Salih", "royal1234");
		//acct3.setEmail("salih@gmail.com",);
		
		System.out.println(acct3.toString());
		
		System.out.println();
		
		EtsyAccount acct4 = new EtsyAccount();
		acct4.setEmail("salih@gmail.com");
		acct4.setFirstName("Salih");
		acct4.setPassword("abc1234");
		
		System.out.println(acct4.toString());
		
		System.out.println();
		
		EtsyAccount acct5 = new EtsyAccount("woodenspoon@gmail.com", "Tomi");
		System.out.println(acct5.toString()); //in every run the password is changed:
//		EtsyAccount [email=woodenspoon@gmail.com, firstName=Tomi, password=10209m]
//		EtsyAccount [email=woodenspoon@gmail.com, firstName=Tomi, password=m79a3x]
	}

}
