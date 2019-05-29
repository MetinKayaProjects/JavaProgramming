package day24_array_Vasyl;

public class StringToCharArray {
	public static void main(String[] args) {
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
		
		System.out.println("\n**** reverse it: ");
		
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
			if(c == 'o') {
				
				System.out.print("*");
			}else {
				System.out.print(c);  //W**den sp**n
			}
			
		}
		
	}

}
