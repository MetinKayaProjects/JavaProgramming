package day06_operators2;

public class ShortHandOperators {
	public static void main(String[] args) {
		
		int students = 45;
		
		// add 5 students
		System.out.println("Students: " + students);
		
		students = students + 5;
		System.out.println("Students: " + students);
		
		students = students - 2;
		System.out.println("Students: " + students);
		
		int teatchers = 10;
		System.out.println("Teatchers: " + teatchers);
		
		//ShortHandAssignment
		
		teatchers +=2; //increase teatchers by 2... esit ile + arasinda bosluk olmamali
				
		System.out.println("Teatchers: " + teatchers);
		
		teatchers -= 5;
		
		System.out.println("Teatchers: " + teatchers);
		
		int cars = 12;
		System.out.println(cars); //12
		
		cars *= 2;  // cars = cars*2;
		System.out.println(cars); //=24
		
		cars += cars;
		System.out.println(cars); //24+24=48
		
		int shoes = 20;
		shoes /= 4;
		System.out.println("Shoes : " + shoes); //Shoes : 5
		
		double price = 45.50;
		int amount = 5;
		price += amount;
		
		System.out.println(price); //50.5
		
		int minutes = 66;
		minutes %= 60;  //minutes = minutes % 60
		
		System.out.println("Remaining : " + minutes);// Remaining : 6
		
		int pennies = 550;
		pennies %=100;  //pennies = pennies % 100;
		
		System.out.println("Pennies left : " + pennies); // Pennies left : 50
		 
		 
		int apples = 10;
		apples -= 3;   //apples = apples - 3
		System.out.println(apples); // 7
		
		
		
	}
	
	

}
