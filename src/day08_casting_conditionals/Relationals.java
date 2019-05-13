package day08_casting_conditionals;

public class Relationals {
	public static void main(String[] args) {
		
		double d1 = 23.562;
		double d2 = 20.43;
		
		System.out.println(d1>=d2);
		boolean check = d1 >= d2;
		
		System.out.println("Check: " +check);
		
		
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		
		System.out.println(ch2>ch1); //true 'j' > 'a' (j'nin ASCII'daki karsiligi a'dan daha buyuk. gppgle... 
		System.out.println(ch1 > ch3); //true    'a'>'A'    (97>65)
		
		boolean b = true == false;
		System.out.println("B: " +b);//false 
		
		b = true != false;  // != not equal to
		System.out.println("B: "+ b); //true
		
	}

}
