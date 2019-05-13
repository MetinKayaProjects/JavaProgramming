package day33_methods05;

import day31_method03.Calculator;

public class CalcTest {
	public static void main(String[] args) {
	
		
		System.out.println(Calculator_Murodil.add(3, 1));
		System.out.println(Calculator_Murodil.multiply(5, 6));
		System.out.println(Calculator_Murodil.minus(4, 56));
		System.out.println(Calculator_Murodil.divide(3, 0));
		System.out.println(Calculator_Murodil.divide(12, 3));
		
		Calculator.add(12, 2);  // void oldugu icin println yapmana gerek yok
		
		
		System.out.println();
		
		int addResult = Calculator_Murodil.add(21, 41);
		double mResult = Calculator_Murodil.multiply(50, 40);
		double miResult = Calculator_Murodil.minus(1000, 200);
		double dResult = Calculator_Murodil.divide(54, 9);
		
		System.out.println("addResult: " + addResult);
		System.out.println("mResult: " + mResult);
		System.out.println("miResult: " + miResult);
		System.out.println("dResult: " + dResult);
		
		double a = 10.0, b= 5.0;
		double myResult = Calculator_Murodil.minus(a, b);
		System.out.println("myResult: "+myResult);
		
		double[] dNums = {2.0, 4.0};
		double result2 = Calculator_Murodil.multiply(dNums[0], dNums[1]);
		System.out.println("result2: " + result2);
		
		if (Calculator_Murodil.add(10, 16) == 26) {
			System.out.println("Add Unit Test passed");
		}else {
			System.out.println("Add Unit Test FAILED");
		}
		
		
		String str = "java";
		if (str.length() == 4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not 4 characters");
		}
	}

}
