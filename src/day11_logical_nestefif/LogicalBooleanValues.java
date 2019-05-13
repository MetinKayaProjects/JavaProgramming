package day11_logical_nestefif;



public class LogicalBooleanValues {
	public static void main(String[] args) {
		
		boolean b1 = 5 > 10 && 10 > 100;
		
		System.out.println("B1: " + b1); //false cunki 5<10 and 10<100
		
		boolean b2 = 'a' == 'a' && 123>120; // a=a ve 123>120  true && true. True olur
		System.out.println("B2: " +b2);
		
		boolean b3 = true && 10 >= 10 && 1000 >= 900; //true
		System.out.println("B3: "+ b3);
		
		boolean b4 = false && false && 10 == 10;
		System.out.println("B4 = " + b4);
		
		boolean b5 = false || true && 10 == 10; // burada and'in onceligi var. carpma gibi dusun
		System.out.println("B5: " + b5);
		
		
		boolean b6 = false && true || 10 != 10; 
		System.out.println("B6: " + b6);
		
		
		boolean b7 = false && (true || 10 != 10); 
		System.out.println("B7: " + b7);
		
		boolean b8 = false && true || 10 == 10; 
		System.out.println("B8: " + b8);
		
		boolean b9 = false && (true || 10 != 10); 
		System.out.println("B9: " + b9);
		
		
		boolean topicDone = true;
		boolean isMoreThan3Pm = true;
		boolean everyThingIsClear = true || false; //true yazar
		
		boolean letsGoForBreak = topicDone && isMoreThan3Pm && everyThingIsClear; 
			//                       (T     &&        T)      &&        T
		//								    T               &&        T
		//													T
		System.out.println("Time to Break: " + letsGoForBreak); //TRUE;
		
		
		boolean b10 = !(true || false) && false; // !(T) && T = F && T = FALSE
		System.out.println("B10: " + b10); 
		
		boolean b11 = !(true || false) && true;
		System.out.println("B11: " + b11);
		
		boolean b12 = true;
		System.out.println(!!b12);
		
		boolean b13 = true;
		System.out.println(!!!b13);
		
		
	}

}
