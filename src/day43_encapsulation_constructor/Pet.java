package day43_encapsulation_constructor;

public class Pet {

	private String type;
	private String name;

	// constroctor
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;

	}

	public Pet() {
		System.out.println("No args contstroctor");
	}

	public void speak() {
		switch (type.toLowerCase()) {
		case "cat":
			System.out.println("Myaau");
			break;
		case "dog":
			System.out.println("haww haww");
			break;
		case "bird":
			System.out.println("cik cik");
			break;
		case "goat":
			System.out.println("Meeee");
			break;
		case "sheep":
			System.out.println("moooo");
			break;
		case "rooster":
			System.out.println("uugguruguuu");
			break;

		default:
			System.out.println(".....");
			break;
		}
	}

//	getter/setter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// to String class
	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}

}
