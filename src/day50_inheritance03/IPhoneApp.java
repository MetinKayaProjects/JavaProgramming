package day50_inheritance03;

public class IPhoneApp extends App {
	//1 add a constructor
	//2 call super constructor 

	public IPhoneApp() {
		super("Iphone App - unknown"); // bu metodu biz mecburen ekledik, cunki compile etmiyordu.. Ancak App'da noarg constructor yok. bu
										// nedenle icine unknown yazdik.
	}

	public IPhoneApp(String name) { // bunu da biz ekledik. cunki parent class(App)'da one arg var.
		super(name);
	}

}
