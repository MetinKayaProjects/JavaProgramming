package day63_exceptions02;

public class MultiCatch {
	public static void main(String[] args) {
		
		try {
			//System.out.println(0/0);  //ArithmeticException happened
			//String str = null;
			//System.out.println(str.length());  //NullPointerException happened
			int[] n = {10, 4};
			System.out.println(n[2]);//RuntimeException happened: class java.lang.ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException happened");  //bunu yazdirir. cunki try icindeki arythmatic ilk erroru yakalayinca catch'e atlar
		}catch (NullPointerException e) {
			System.out.println("NullPointerException happened");
		}catch (RuntimeException e) {  //this is parent to ArithmeticException and NullPointerException
									//bu en ustte olursa compile errror verir. Digerleri naccessible olur
			System.out.println("RuntimeException happened: " + e.getClass());
		}
		
		
	}

}
