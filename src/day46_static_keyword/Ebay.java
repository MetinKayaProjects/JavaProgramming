package day46_static_keyword;

public class Ebay {
	public static void main(String[] args) {
		//first customer
		Customer cm1 = new Customer("Abdullah Aleies", "AbdullahAleises@gmail.com");
		//2nd customer
		Customer cm2 = new Customer("ADILET KYRGYZ", "adiletkyrgyz@yahoo.com");
		//3rd customer
		Customer cm3 = new Customer("Anastasia Zasipna","Anastasia@outlook.com");
		
		System.out.println(cm3.count); //3, Customer class'da int'in basina static eklemezsen bu 1 cikiyor
		
		System.out.println(Customer.count);
		
		Customer cm4 = new Customer("Burak Ocal", "burak@yahoo.com");
		
		System.out.println(cm1.count); //4   there are 4 customer
		System.out.println(cm2.count); //4
		System.out.println(cm3.count); //4
		System.out.println(cm4.count); //4
		System.out.println("Total Customer: " + Customer.count);// 4 Customer tanimladik
		
			
//		Customer.count = cm1 =cm2 =cm3 =cm4... 
		cm1.count = 10;// this affect all the customer numbers
		System.out.println(cm1.count);
		System.out.println(cm2.count);
		System.out.println(cm3.count);  //10
		System.out.println(cm4.count);
		System.out.println(Customer.count);//10
		
		
	}

}
