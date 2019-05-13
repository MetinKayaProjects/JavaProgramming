package day42_customclasses_encapsulation;
import java.util.*;
public class DSWShoeStore {
	public static void main(String[] args) {
				
		Shoes shoes1 = new Shoes();
		shoes1.setShoesData("ALDO", 6.5);
		System.out.println("shoes1 : " + shoes1.getShoesData()); //ALDO | 6.5  //return type
		
		System.out.println();
		
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("Allen Edmonds", 7.5);
		System.out.println("shoes2 : " + shoes2.getShoesData());
		System.out.println();
		
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("Boss Hugo", 9.5);
		System.out.println("shoes3 : " + shoes3.getShoesData());
		
		System.out.println();
		System.out.println("let's create Array:");
//		let's create Array
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		
		System.out.println(shoesArray[0].getShoesData());//ALDO | 6.5
		System.out.println(shoesArray[1].getShoesData());//Allen Edmonds | 7.5
		System.out.println(shoesArray[2].getShoesData());//Boss Hugo | 9.5
		
		System.out.println();
		
		System.out.println(shoesArray[0].brand);//ALDO
		System.out.println(shoesArray[1].brand);//Allen Edmonds
		System.out.println(shoesArray[2].brand);//Boss Hugo
		
//		ArrayList of Shoes:
		System.out.println("ArrayList of Shoes:");
		
		ArrayList<Shoes> myShoes = new ArrayList<Shoes>();
		myShoes.add(shoes1);
//		myShoes.add("Tanca"); Does not compile. since TAncawas not declared as of shoes4
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
		System.out.println(myShoes.get(0).getShoesData());//ALDO | 6.5
		System.out.println(myShoes.get(1).getShoesData());//Allen Edmonds | 7.5
		System.out.println(myShoes.get(2).getShoesData());//Boss Hugo | 9.5
		
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		
		System.out.println();
		
		Shoes redShoes = myShoes.get(0); //Shoes artik String gibi class
		
		System.out.println(redShoes.getShoesData());//ALDO | 6.5  //return type oldugundan System.out.println...
		
		System.out.println();
		System.out.println("let's use for each loop: -----");
		//let's use for each loop
		for(Shoes shoes : myShoes) {
			System.out.println(shoes.getShoesData());
		}
		
		System.out.println();
		
		System.out.println("print name of Shoes in the list that size is more than 7 : ");
		for (Shoes shoes : myShoes) {
			if (shoes.size > 7.0) {
				System.out.println(shoes.brand);
//													Allen Edmonds
//													Boss Hugo
			}
		}
		
	}

}
