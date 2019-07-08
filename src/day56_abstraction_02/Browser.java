package day56_abstraction_02;

public abstract class Browser {
	// we can add instance or static variables into abstract classes!
	static int id;
	String name;
	
//  abstract methods:
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();

// in abstract method we don't worry about implementation/body< only worry about name of the behavior/method
	// we add the implementation in a non-abstract subclass...

//  we can also add non-abstract method into abstract class
	public void close() {
		System.out.println("Exitting the browser");
	}

	// we can also add constructor, we can only call this by using SUPER keyword.
	public Browser() {
		System.out.println("Creating a Browser");
	}
//  cinstructor-2
	public Browser(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// we can also static or init block into abstaction class

	static {
		System.out.println("static block");
	}

	{
		System.out.println("init block");
	}

}
