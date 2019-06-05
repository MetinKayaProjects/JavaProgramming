package day42_customclasses_encapsulation;
import java.sql.Array;
import java.util.*;
public class Burger7 {
	public static void main(String[] args) {
		
		Burger burger1 = new Burger();
        burger1.name = "COWBOY";
        String[] ings = {"onion crisps", "american cheese", 
                       "pickles", "lettuce", "b7 sauce"};
        burger1.ingredients = ings;
        
        System.out.println(burger1.name); //COWBOY
        System.out.println(Arrays.toString(ings));
        System.out.println(Arrays.toString(burger1.ingredients));//[onion crisps, american cheese, pickles, lettuce, b7 sauce]
        System.out.println();
        //print out only first ingredient
        
        System.out.println((burger1.ingredients[0])); //onion crisps
        System.out.println();
        
        //by loop print all ingredients array
        for(String ing : burger1.ingredients) {  // burger1.ingredients yerine ings de olurdu
        	System.out.println(ing);
        	
        }
        System.out.println();
        
        for(String ing : ings) {  // burger1.ingredients yerine ings de olurdu
        	System.out.println(ing);
        	
        }
        
        
        
	}

}
