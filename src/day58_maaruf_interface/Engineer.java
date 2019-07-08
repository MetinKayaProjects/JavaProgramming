package day58_maaruf_interface;

public class Engineer implements Person {

	@Override
	public String getOccupation() {
		return "engineer";
	}

	@Override
	public String getIncome() {
		return "90K";
	}

	@Override
	public String getWork() {
		return "testing things 8 hours a day and also meeetings";
	}

	
}