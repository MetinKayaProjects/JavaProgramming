package day34_methods06;

public class MethodOverloading {
	public static void main(String[] args) {
		add(3, 6);//public static void add(int num1, int num2)
		add("3", " 6");  // String olarak gorur
		add(11.10, 10.15);//public static void add(double num1, double num2)
		add(23.4, 10);//double
		add("one", "two");//onetwo     string
	}
	
	public static void add(int num1, int num2) {
		int result= num1 + num2;
		System.out.println(result);
	}
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	
	public static void add(String str1, String str2) {
		String result = str1 + str2;
		System.out.println(result);
	}

}
