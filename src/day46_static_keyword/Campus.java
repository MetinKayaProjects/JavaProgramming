package day46_static_keyword;

public class Campus {
	
	static String city;
	static String country;
	
	
	static {
		System.out.println("static block-1");
		country = "USA";
	}
	static {
		System.out.println("static block-2");
		country = "Canada";
	}
	
	//constructor
	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	public static void campusInfo() {
		System.out.println("Welcome to campus");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
