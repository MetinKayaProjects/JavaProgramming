package day62_exceptions01_1;

public class IQFinally {
	public static void main(String[] args) {
		int k = getNum();
		System.out.println(k);
	}
	
	public static int getNum() {
		try{
			return 10;
		}catch(Exception e) {
	        System.out.println("Exception!");
	        return 5;
		}finally{
			System.out.println("Finally");
		}
	}
}