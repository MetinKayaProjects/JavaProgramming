package day50_inheritance03;

public class FullTimeEmployee extends Employee {

	/*
	 * FullTimeEmployee version: //should include 5% bonus
	 * "FullTime employee total pay: " + total
	 */
	@Override
	public void calculatePay(int hours, double rate) {
		double total = hours * rate * 1.05; //5% bonus
		System.out.println("FullTime employee total pay: " + total);
	}

}
