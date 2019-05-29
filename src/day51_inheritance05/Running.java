package day51_inheritance05;

/*
 * Running
		"Running"
		10 cal/minute
 */
public class Running  extends Exercise{
	
	public int perform(int minutes) {
		System.out.println("Running");
		return minutes * 10;
	}
	
}
