package day59_polymorphism_03;

public class HairSpray implements Flammable{

	@Override
	public void catchFire() {
		System.out.println("Be careful, Dont use HairSpray next to open fire");
	}

}
