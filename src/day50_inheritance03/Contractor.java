package day50_inheritance03;

public class Contractor extends Employee {

	/*
	 * Contractor version: //gets $200 extra for each pay
	 * "Contractor employee total pay: " + total
	 */
	@Override
	public void calculatePay(int hours, double rate) {
		double total = hours * rate +200; //5% bonus
		System.out.println("Contractor employee total pay: " + total);
	}

}
