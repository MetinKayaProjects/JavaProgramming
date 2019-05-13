package day43_encapsulation_constructor;

public class MyPets {
	public static void main(String[] args) {
		
		Pet pet1 = new Pet("Dog" , "Poohchi");
		Pet pet2 = new Pet("Cat" , "Barsik");
		Pet pet3 = new Pet("Cat" , "Mila");
		Pet pet4 = new Pet("Fish", "Purple");
		Pet pet5 = new Pet("Goat", "Kozlik");
		Pet pet6 = new Pet("Bird", "Mina | Chika");
		
		pet1.speak();
		pet2.speak();
		pet3.speak();
		pet4.speak();
		pet5.speak();
		pet6.speak();
		
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
		System.out.println(pet3.toString());
		System.out.println(pet4.toString());
		System.out.println(pet5.toString());
		System.out.println(pet6.toString());
		
		System.out.println();
		
		System.out.println("getName(): " + pet1.getName() + " | getType: "+ pet1.getType());
		System.out.println("getName(): " + pet2.getName() + " | getType: "+ pet2.getType());
		System.out.println("getName(): " + pet3.getName() + " | getType: "+ pet3.getType());
		System.out.println("getName(): " + pet4.getName() + " | getType: "+ pet4.getType());
		
	}
}