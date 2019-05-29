package day50_inheritance03;

public class AndroidApp extends App {
	// 1 add a constructor
	// 2 call super constructor
	
	public AndroidApp() {
		super("Android App - unknown");
	}

	public AndroidApp(String name) {
		super(name);
	}

}
