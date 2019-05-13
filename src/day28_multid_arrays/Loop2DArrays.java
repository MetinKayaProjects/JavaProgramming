package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		
		 String[][] pizzas = {
	                {"pineapple","pepperoni"}, //0
	                {"anchovies", "mushroom", "olives"}, //1
	                {"4 cheese"}, //2
	                {"chicken", "tomatoes", "japalenios","onions"},//3
	                {"green peppers", "zuccini","brocolli", "spinach","shrimp"}//4                
	                 };
	        
	      
		 System.out.println(Arrays.deepToString(pizzas));
//		 [[pineapple, pepperoni], [anchovies, mushroom, olives], [4 cheese], [chicken, tomatoes, japalenios, onions], [green peppers, zuccini, brocolli, spinach, shrimp]]
		 
		 System.out.println("\n##### FOR EACH/Enhanced For Loop #####");
		 
	        for(String[] pizza : pizzas) {
	           System.out.println(pizza.length + " type(s) pizzas: "+"-" + Arrays.toString(pizza));
	        }
	        
	        System.out.println("\n##### FOR LOOP #####");
	        for(int i = 0; i < pizzas.length; i++) {
	            System.out.print(pizzas[i].length + "-");
	            System.out.println(Arrays.toString(pizzas[i]));
	        }
	        
	        for(String topping : pizzas[3]) {
	            System.out.print(topping + " "); //chicken tomatoes japalenios onions 
	        }
	        

	        System.out.print("\n" + Arrays.toString(pizzas[3]) + " ");  //[chicken, tomatoes, japalenios, onions]
	        System.out.print("\n" + (pizzas[3][2])); //japalenios
	        
	        System.out.println();
	        int[][] students = {{4,5,6}, 				//group[0]
	                           {12,5,7}, 				//group[1]
	                           {23,56,12,55,3} 			//group[2]
	                           };
	   
	        System.out.println("### INNER FOR LOOP ####");
	        //2 parts: outer loop, inner loop
	        //outer loop will take each group
	        //inner loop will take each value/student id
	        for(int[] group : students) {
	            for(int studentId : group) {
	                System.out.print(studentId +", ");
	            }
	            System.out.println();
	        }
	        
	        
	        System.out.println("**** nested for loop ****");
		int[][] nums = { 
						{10, 20},    						//array 0   i=0 >nums[0]
						{25,35,45,55},						//array 1   i=1 >nums[1]
						{111,211,411},						//array 2   i=2 >nums[2]
						{1000,2000,3000,4000,5000,6000} 	//array 3   i=3 >nums[3]
						  };
//		System.out.println(nums.length);//4
//		System.out.println(nums[0].length); //2
		
		for (int i = 0; i < nums.length; i++) {		//nums.length: 4		
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
