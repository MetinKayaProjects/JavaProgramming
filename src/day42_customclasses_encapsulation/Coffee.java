package day42_customclasses_encapsulation;

public class Coffee {
//	instance variables:
//	name
//	size
//	price
//	calories

//	Methods:
//		getCoffeeInfo()
//		prints above data

	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase()+" | "+size.toUpperCase()+" |  $" +price+ " | "+calories+" CAL";
		System.out.println(info);
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall") ||
				newSize.equalsIgnoreCase("grande") ||
				newSize.equalsIgnoreCase("venti")) {
				size = newSize;
			}else {
				System.out.println("ERROR: Invalid Size - " + newSize);
				size = "unknown";
			}
		
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCalories(int newCal) {
		calories = newCal;
	}
//	method name: setCoffeeInfo
//	void
//	params: String newName, String newSize, double newPrice, int newCal
//	it will assign 4 values to 4 instance variables
	
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
				
		setName(newName);
		setSize(newSize);
		setPrice(newPrice);
		setCalories(newCal);
		
		//this is also possible:
//		name = newName;
//		size = newSize;
//		price = newPrice;
//		calories = newCal;
		
		
		
	}
	
}