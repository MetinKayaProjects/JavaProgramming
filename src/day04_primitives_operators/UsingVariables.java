package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {  //main+control+space sonra enter'a basarsak bu cikar
		
		//declare int variables num1, num2, num3, 
		
		int num1, num2, num3;
			
			//assign 100 to num1
			num1=100;
			
			//assign value of num1 to num2
			num2=num1;
			//print num1 and num2 values in seperate lines
			
		System.out.println(num1); //ne yazar=100
		System.out.println(num2); // ne yazar=100
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		// print also below
		num2=200;
		num1=num2;
		num3=num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		num2=200;
		num3=num1; // burada num3, num1'i yukarida en son aladigi degerle hatirlar=200
		num1=num2; //burada num1, num2/yi alir ve 200 olur
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("============================ "); //araya bos bir satir koymak icin
		
		// declare apples and assign 25
		
		//Int Apples = "25"   hata int olmali, apples olmali. tirnak olmamali
		int apples = 25;
		
		// declare kiwis and assign value of apples to it
		
		int kiwis = apples; // kiwis=25 atar
		
		// declare mangoes and 55
		
		int mangoes = 55; //mangoes=55 atar
		
		//  assign mangoes to kiwis
		
		kiwis = mangoes;  // kiwi/ye 55 atar
		
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
		
		
	}

}
