package day58_maaruf_interface;


public class UberDriver implements Person {

	@Override
	public String getOccupation() {
		return "Uber driver";
	}

	@Override
	public String getIncome() {
		return "50K";
	}

	@Override
	public String getWork() {
		return "pick up people and drop off people so on and so on";
	}

}
