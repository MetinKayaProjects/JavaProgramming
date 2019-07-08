package day59_polymorphism;

public class AnimalShow {
	public static void main(String[] args) {
		
		Animal animal1 = new Animal(); 
		
		//Polymorphism: 
		Animal tiger = new Tiger();
		Animal zebraAnimal = new Zebra();
		Animal ch = new Cheetah();
		
		animal1.talk();			//Animal is talking...
		zebraAnimal.talk();		//Zebra is talking...> Zzzzeee
		tiger.talk();			//Tiger is talking...> Roar
		ch.talk();				//Cheetah is talking > chii arr
		
		System.out.println();
		
		Animal [] animals = new Animal[3];
		animals[0] = new Tiger();
		animals[1] = new Cheetah();
		animals[2] = new Zebra();
		
		animals[0].talk();      //Tiger is talking...> Roar
		animals[1].talk();		//Cheetah is talking > chii arr
		animals[2].talk();		//Zebra is talking...> Zzzzeee
		
		
	}

}
