package day04_primitives_operators;

public class EscapeSquence {
	public static void main(String [] args) {
		//prind He said "Hello".
		
		// System.out.println ("He said "Hello".");  bu hata veriyor. cunku ilk tirnak icini yazdir anliyor.
		
		System.out.println ("He said \"Hello\".");
		
		//print this: Would you like 'coffee' or 'tea'?
		
		System.out.println("Would you like \'coffee\' or \'tea\'?");
		System.out.println("Would you like \'coffee\' or \'tea?\'");
		System.out.println("Would you like 'coffee\' or 'tea'?");
		
		//print "\__/"
		System.out.println("\"\\__/\"");// backslah icin double backslash (\\) yapmamiz gerekiyor.
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		//print this: Java
		//            Selenium
		
		//1st way
		
		System.out.println("Java");
		System.out.println("Selenium");
		
		//2nd way
		System.out.println("Java\n Selenium");//    \n Selenium'u alt satira atar. 
		                                      //ama n'den sonra araya bosluk koyarsan Selenium alt satirda bir karakter iceriden baslar 
		System.out.println("Java\nSelenium");
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		int n=10;
		n=100;      // ne yazar, 10 mu 100 mu? cevap 100. cunku value,yu 100 olarak degistirdik.
				System.out.println(n);
		
				System.out.println("============================ ");//araya bos bir satir koymak icin
		int m=10;
		int i=m;
		
		System.out.println(i);// buna gore 10 yazdirir
		System.out.println(m);// buna gore de 10 yazdirir
		
		
		
		
		
		
		
	}

}
