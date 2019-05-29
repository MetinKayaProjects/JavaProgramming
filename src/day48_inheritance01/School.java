package day48_inheritance01;

public class School {
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Obama";
		person.age = 57;
		person.gender = 'M';
		
		student.name = "Roman";
		student.age = 30;
		student.gender = 'm';
		student.studentID=3433;
		student.clazz = "Ping Pong";
		
		person.eat("Steak");
		student.eat("grechka");
		
		person.walk();
		student.walk();
		
		person.sleep(8);
		student.sleep(7);
		
		System.out.println();
		
		Student student2 = new Student();
		student2.name = "Orhan";
		student2.age = 40;
		System.out.println("student2 name: " + student2.name);
		System.out.println("student2 age: " + student2.age);
		student2.gender = 'm';
		student2.studentID = 4040;
		student2.clazz = "AGILE";
		student2.code("Java");
		student2.attendClass();
		student2.eat("kebap");
		student2.walk();
		System.out.println();
		
		System.out.println("student name: " +student.name + " | " + "student age: " + student.age);
		student.code("Python");//!! student is Roman. this is not student2
		student.attendClass();
		student.eat("apple");
		
		
	}

}
