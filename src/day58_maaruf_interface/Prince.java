package day58_maaruf_interface;

public class Prince implements Person {
	
	public void rideMyexpensiveCar() {
		
	}

	@Override
	public String getOccupation() {
		return "like I have one";
	}

	@Override
	public String getIncome() {
		return "all of dad's money";
	}

	@Override
	public String getWork() {
		return "nothing";
	}

}