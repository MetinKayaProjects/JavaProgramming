package day05_math_operators;

import javax.lang.model.type.DeclaredType;
import javax.xml.ws.AsyncHandler;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		//+ _ addition operator
		
		System.out.println(55+5); //60 addition operator
		
		int chairs=140;
		System.out.println(chairs+2); //142
		
		
		int moreChairs=chairs + 5;
		System.out.println(moreChairs); //140+5=145
		
		int tables=130;
		int total=tables+chairs;
		System.out.println(total); //270
		
		// - subtraction, same as minus
		
		System.out.println(500-123); //377
		
		int result=44-23;
		System.out.println(result); //21
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction); //1144.06
		
		System.out.println(balance); //1200.50
		
		
		//create a vlraible linesOfCode and assign 50 AsyncHandler printAsyncHandler "Lines of code 50"
		//you deleted 2 lines
		//decrease the value of linesOfCode by 2 and print "Lines of Code 48"
		
		int linesOfCode = 50; //byte olarak da tanimlanabilr
		
		System.out.println("Lines of Code " + linesOfCode);
		
		linesOfCode = linesOfCode - 2;
		
		System.out.println("Lines of Code " + linesOfCode);
		
		// multification
		
		System.out.println(22*22); //484
		
		//DeclaredType variablesDeclaredType classes and assign 5
		
		int classes = 5;
		System.out.println(linesOfCode * classes); //240
		
		int totalLinesOfCode = linesOfCode * classes;
		System.out.println(totalLinesOfCode); //240
		
		//Print: totalLinesOfCode=240
		
		System.out.println("totalLinesOfCode= " + totalLinesOfCode);
		
		//DIVISION operator / 
		
		System.out.println(10/3); //3 yazar. cunku bunlara integer, whole number.
		
		System.out.println(55/5); //11
		
		System.out.println(10.0/3); // 3.33333333333
		
		System.out.println(15/7); //2
		
		System.out.println(15.0/7); //2.142857142857143
		
		System.out.println(5/2); //2
		
		System.out.println(5/2.0); //2.5
		
		System.out.println(5.0/2); //2.5
		
		System.out.println(5.0/2.0); //2.5
		
		// System.out.println(11/0); //error
		System.out.println(0/11); //0
		
		//REMAINDER OPERATOR ICIN YENI CLASS ACTIK
		
		
		
		byte b = 10;
		short sh = 20;
		//short total = b+sh;  // bu calismaz. cunku short'a degisken atayamayiz.
		int totalNumber = b+sh;
		
		short totalNumber2 = 200 + 2; // short'da sag tarafa degisken degil, dogrudan data atariz
		
		sh = 34+4;
		
		System.out.println(totalNumber); //30
		System.out.println(totalNumber2); //202
		System.out.println(sh); // 38
		
		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2; // burada byte = b1 + b2 hata verir. 
		
		
		
	}

}
