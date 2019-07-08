package day63_exceptions02;

public class MethodsWithThrows {
	public static void main(String[] args) throws Exception {   //2.throws Exception declaration at the method line
		//playWithMatches(); tek basina error veriyor
		//to fix it there are two solution:
		//1. handling by try and catch
		//2.throws Exception declaration at the method line
		
		//1
		try {
			playWithMatches();
		} catch (Exception e) {
			System.out.println("Stopped the fire with water");
		}
		playWithMatches();
		playSoccer();
	}
	//Checked 
	public static void playWithMatches() throws Exception {
		System.out.println("Playing with matches can cause fire");
	}
	//Unchecked
	public static void playSoccer() throws RuntimeException{
		System.out.println("Playing soccer with friends");
	}

}
