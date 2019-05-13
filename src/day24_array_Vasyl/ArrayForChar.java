package day24_array_Vasyl;

public class ArrayForChar {
	public static void main(String[] args) {

		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.print(value); // abc
		}
		
		System.out.println();
		
		String[] names = {"George", "Smith", "Ali", "Veli"};
		System.out.println(names[0]);   //George
		System.out.println(names[1]);   //Smith
		System.out.println(names[2]);   //Ali
		System.out.println(names[3]);   //Veli
		for(String name: names) {
			System.out.print(name + " ");  //George Smith Ali Veli
			
			//System.out.print(name.charAt(0));  //GSAV
			
		}
		System.out.println();
		
		System.out.println();
		System.out.println(names[0].charAt(0));  //G
		System.out.println(names[1].charAt(4));  //h
		System.out.println(names[2].charAt(1));  //l
		System.out.println(names[3].charAt(3));  //i

		System.out.println("\n****");

		String str = "Wooden spoon";
		// this method toCharArray() converts String into array of characters
		char[] chars = str.toCharArray();  // {'W','o','o','d','e','n',' ','s','p','o','o','n'}
		for (char c : chars) {
			System.out.print(c);  //Wooden spoon
		}
		System.out.println("\n****");
		
		
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]); //noops nedooW
		}
		
		System.out.println("\n****");
		
		str = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			str+=chars[i];
			System.out.print(chars[i]);
		} //OR:
		System.out.print("\n" +str); //noops nedooW
		
		System.out.println("\n++++++++++++++++++++++");
		//TASK: use the same for loop 
		//print characters with help of array characters, one by one
		//if characters is equals to 'o', replace with '*'
		
		for (char c : chars) {
			if(c=='o') {
				
				System.out.print("*");
			}else {
				System.out.print(c);  //W**den sp**n
			}
			
		}
		
		
	}

}
