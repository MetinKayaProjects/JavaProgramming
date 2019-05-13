package day42_customclasses_encapsulation;

public class People {
	public static void main(String[] args) {

		Person p1 = new Person();
		// p1.age = 1  // not visible. since age is private
		// p1.age = 1; not visible
		// p1.name = "Jim"; not visible
		p1.setName("Metin");
		System.out.println(p1.getName()); // Person class icindeki getNeme() metodu return oldugundan burada sysout
											// icinde yazdiriyoruz.
		p1.setAge(25);
		System.out.println(p1.getAge());
		System.out.println(p1.getName() + " is "+ p1.getAge() + " year old.");

	}

}
