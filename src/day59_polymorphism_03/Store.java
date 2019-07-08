package day59_polymorphism_03;

public class Store {
	public static void main(String[] args) {
		HairSpray hp = new HairSpray();
		hp.catchFire();
		
		Flammable hairSp = new HairSpray();
		hairSp.catchFire();
	    //interface           implementing class/sub class
		Flammable pTank = new PropaneTank();
		pTank.catchFire();
		
		
	}
}
