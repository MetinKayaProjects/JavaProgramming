package day55_abstraction_4;

public class Sailboat extends Vehicle{

	private int lenght;

	
	//constructor
	
//	public Sailboat(int wheel, double price, String type, String powerSource)
	public Sailboat(double price, int lenght) {
		super(0, price, "sailboat", "wind");  // buradan wheel, type ve powerSource'u bildigimiz ve bunlar degismeyecek ozellikler oldugundan burada atadik
		this.lenght = lenght;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Sailboat is sailing on the sea...");
	}
	public int getLength() {
		return lenght;
	}
	

}
