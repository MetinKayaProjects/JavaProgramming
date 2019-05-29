package day51_inheritance05;
/*
 * Exercise:
	public int perform(int minutes)
		"Doing general exercise"
			4 calories per minute
 */
public class Exercise {    //this is parent class
	
	public int perform(int minutes) {
		System.out.println("Performing general exercise");
		return minutes * 4;
	}
	
}
// class Running extends Exercise{
//	
//}
