package day07_scanner_operators;

public class PreAndPost {
	
	public static void main(String[] args) {
		
		int num = 0;
		int num2 = num++;  //once num'i (0) num2'ya atar sonra 1 ekler
		
		System.out.println("num: " + num);  //  1
		System.out.println("num2: " + num2); // 0
		
		int n = 0;
		int n2 = ++n;
		
		System.out.println("n: "+ n);
		System.out.println("n2: " + n2);
		
		int i =10;
		i++; //add 1
		++i; //add 1
		
		System.out.println("I value: " + i);
		
		System.out.println("=============================");
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("Bananas: "+bananas);//8
		System.out.println("Pears: "+ pears);//6
		System.out.println("Apples: "+ apples);//8
		
		System.out.println("=============================");
		
		int a = 77;
		int b = ++a;//=(1+77)+1
		int c = ++b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		
				
		System.out.println("=============================");
		
		int friends =10;
		System.out.println(friends++); //10
		System.out.println(friends);//11
		System.out.println(friends++);//11
		
		System.out.println("=============================");
		
		int p1 = 10;
		int sum = p1++ +5;
		
		System.out.println("sum: " +sum);
		System.out.println("p1: "+ p1);
		
		
		System.out.println("=============================");
		int battaries = 8;
		int oldBattaries = 5;
		int totalBattaries = battaries++ + ++oldBattaries;
		
		System.out.println("battaries: " + battaries); //9
		System.out.println("old battaries: " + oldBattaries);//6
		System.out.println("total Battaries: " + totalBattaries);//14
		
		
		
		
		
	}

}
