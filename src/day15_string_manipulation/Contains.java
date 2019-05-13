package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {

		String email = "test@gmail.com";
		
		System.out.println(email.contains("@")); // true
		
		String list = "potatoes, tomotoes, eggs, milk, apples, , bread, cereal, meat";
		
	//check if apples in the list
		//true==> apples are there!
		//false==> Lets add apples now
		
		if(list.contains("apples")) {
			System.out.println("Apples are there!");
		}else {
			System.out.println("Let's add apples now!");
		}
		
		if(list.contains("strawberry")) {
			System.out.println("straawberry are there!");
		}else {
			System.out.println("Let's add strawberry now!");
		}
		
		boolean hasIt = list.toLowerCase().contains("potatoes"); // onemli!!!!!!!!!!!!!!!!!!!!!1
		
				if(hasIt) {
					System.out.println("Yes, List contains potatoes");
				}else {
					System.out.println("no potatoes in the list");
				}
		email = "name@yahoo.com";
		
		if(email.contains("@yahoo")) {
			System.out.println("This is yahoo email");
		}else if(email.contains("@gmail")) {
			System.out.println("This is Gmail account");
		}else if(email.contains("@hotmail")) {
			System.out.println("This is Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not dedected");
		}
		
		String name = "Metin";
		if(name.contains("e") || name.contains("w")){
			System.out.println("Yes, e or w is there");
		}else {
			System.out.println("None of them are not there");
		}
		

		
 }
}
