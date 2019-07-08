package day57_interfaces;

public interface Electric {  //interface class yapmak icin class yerine interface yazdik
	public static final boolean HAS_BATTERIES = true;  //variable
	//int MAX_BATTERIES = 100_000;   //variable. olmayanlari java ekleyip asagidaki gibi kabul eder.
	public static final int MAX_BATTERIES = 100_000;   //is also ok
	
	public abstract void charge();  //abstract method
	

}
