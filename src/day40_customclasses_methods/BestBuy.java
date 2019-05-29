package day40_customclasses_methods;

public class BestBuy {

	public static void main(String[] args) {
//this method call from CellPhonce class
		// System.out.println(brand);
		// Above line will not work, we need object to use brand
		// Create CellPhone object
		CellPhone cell = new CellPhone(); // bunu CellPhone() classindan cekiyoruz.

		System.out.println(cell.brand); // null
		System.out.println(cell.screenSize); // 0.0
		
		cell.brand = "Iphone";
		cell.screenSize = 7.8;
		cell.color = "Grey";
		cell.price = 800.00;

		System.out.println("Brand: " + cell.brand);
		System.out.println("screenSize: " + cell.screenSize);
		System.out.println("color: " + cell.color);
		System.out.println("price: " + cell.price);

		cell.color = "Black";
		System.out.println("color:" + cell.color);

		System.out.println("\n+++++ Cell2 values +++++");
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Samsung";
		cell2.screenSize = 9.2;
		cell2.color = "Silver";
		cell2.price = 876.98;

		System.out.println("Brand: " + cell2.brand);
		System.out.println("screenSize: " + cell2.screenSize);
		System.out.println("color: " + cell2.color);
		System.out.println("price: " + cell2.price);
		
		System.out.println("---- Calling Methods ----");
		//bunlar void oldugundan syso yaptirmaya gerek yok. class adini yazmaya gerek yok
		cell.call();    //public void call()'dan cagiriyoruz
		cell.message(); //public void message()
		cell.takeAPhoto();//public void takeAPhoto() 
		
		System.out.println();
		
		cell2.call();
		cell2.message();
		cell2.takeAPhoto();
		
		System.out.println();
		
		Contact c1 = new Contact();
		c1.email = "mtn@gmail.com";
		c1.name = "mtn";
		c1.phoneNumber = "212-333-444";
		c1.sendEmail();
		c1.call();
		c1.name();
		c1.sendMessage();

		c1.toString();

	}

}
