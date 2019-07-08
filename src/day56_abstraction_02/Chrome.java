package day56_abstraction_02;

public class Chrome extends Browser {

//	abstract metodlari Body ile override edecegiz
//	public abstract void navigate(String url);
//	public abstract void displayWebpage();
//	public abstract boolean launch();
	
	@Override
	public void navigate(String url) {
		// TODO Auto-generated method stub
		System.out.println("Chrome - navigating to " + url);

	}

	@Override
	public  void displayWebpage() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - displaing webPage: " + super.name +" - id: "+ + super.id);  //this.name and this.id is also ok
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		System.out.println("Chrome is launching");
		System.out.println("1 2 3");
		return true;
	}

	public void close() {
		super.close();   ////Exitting the browser
		System.out.println("Exitting Chrome");
	}

	public Chrome(String name, int id) {
		super(name, id);
	}

}
