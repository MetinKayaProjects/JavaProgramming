package day50_inheritance03;

public class AppsFactory {
	public static void main(String[] args) {
		
		IPhoneApp iApp = new IPhoneApp();
		IPhoneApp iApp2 = new IPhoneApp("Uber");
				
		System.out.println(iApp.getName());//Iphone App - unknown >called super("Iphone App - unknown");
		System.out.println(iApp2.getName()); //Uber
		
		AndroidApp andrApp = new AndroidApp();
		AndroidApp andrApp2 = new AndroidApp("Lyft");
		
		System.out.println(andrApp.getName());//Android App - unknown called super("Android App - unknown");
		System.out.println(andrApp2.getName());//Lyft
		
		App.count=33;
		System.out.println(App.count=33);
//		IPhoneApp.count=55;  // this is also okey
		System.out.println(IPhoneApp.count);
		System.out.println(AndroidApp.count);
		
		AndroidApp.count=100;
		System.out.println(AndroidApp.count);//100
		
		System.out.println("App.count: " +App.count);//100
		System.out.println("IphoneApp count: " + IPhoneApp.count);//100
		System.out.println("AndroidApp count: " + AndroidApp.count);//100
		
		System.out.println();
		
//		public static void build(String language) >> public oldugundan visible
		App.build("Swift"); //App'a bak
		IPhoneApp.build("Objective C");
		AndroidApp.build("Java");
		andrApp2.build("JS");
		
		
	}

}
