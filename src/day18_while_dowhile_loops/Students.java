package day18_while_dowhile_loops;

public class Students {
	public static void main(String[] args) {
		
		int numberOfStudents = 1;
		
		//using a loop, iterate until we have 10 students in the room
		// in the room
		//Student1
		//Student2
		//...
		//10 students
		//No more space
		
		while(numberOfStudents<=10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
		}
		System.out.println("No more space in the room:(");
	}

}
