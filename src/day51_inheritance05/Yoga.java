package day51_inheritance05;
/*
 * Yoga
		5 cal/minute
 */
public class Yoga extends Exercise{
	
	public int perform(int minutes) {
		System.out.println("Yoga");
		return minutes * 5;
	}

}
