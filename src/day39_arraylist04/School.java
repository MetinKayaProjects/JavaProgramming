package day39_arraylist04;

public class School {
	public static void main(String[] args) {
		
//		create object from Student class
		Student student1 = new Student();  //Similarly with: Random r = new Random();
											               //Scanner scan = new Scanner(System.in); 
		
		student1.name = "Roman";
		student1.age = 25;
		student1.subject = "Java";
		
		System.out.println("Name: " + student1.name);
		System.out.println("Age: " + student1.age);
		System.out.println("Subject: " + student1.subject);
		
		System.out.println();
		
		Student student2 = new Student();
		student2.name = "Ahmet";
		student2.age = 28;
		student2.subject = "Agile";
		
		System.out.println("Name: " + student2.name);
		System.out.println("Age: " + student2.age);
		System.out.println("Subject: " + student2.subject);
		
	}

}
