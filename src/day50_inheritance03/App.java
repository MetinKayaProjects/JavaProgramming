package day50_inheritance03;

public class App {
	private String name;
	private String developer;
	public static int count;
	
	
	
	//public App(){}
	public App(String name) { //one-arg constructor 
		this.name = name;
	}
	
	public static void build(String language) {
		System.out.println("Building an app using " + language);
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	

}

