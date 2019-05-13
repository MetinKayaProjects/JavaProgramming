package day43_encapsulation_constructor;

public class MicroCenter {
	public static void main(String[] args) {
		
		Computer comp1 = new Computer(); //Computer constructor...:public Computer() {
		Computer comp2 = new Computer(); //Computer constructor...
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		System.out.println();
		
		comp1.setBrand("iMac");
		comp1.setOs("macOS High Sierra");
		comp1.setPrice(2000);
		
		comp2.setBrand("Dell XPS");
		comp2.setOs("Windows 10");
		comp2.setPrice(1300);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		System.out.println();

		Computer comp3 = new Computer("ASUS" , "Windows 7", 654.5);
//		public Computer(String brand, String os, double price) under Computer class
		
		System.out.println(comp3.toString());
		
		comp3.setOs("Windows 11"); //let's change windows 7 to 11
		System.out.println(comp3.toString());
		
		comp3.setPrice(comp3.getPrice()-200); // price 654.5 -200
		System.out.println(comp3.toString()); // 454.5
		
		
	}

}
