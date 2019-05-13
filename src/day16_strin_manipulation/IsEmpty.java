package day16_strin_manipulation;

public class IsEmpty {
	public static void main(String[] args) {

		String userNAme = "";
		String password = "";
		System.out.println(userNAme.isEmpty()); // true

		if (userNAme.isEmpty()) {
			System.out.println("Username field cannot be empty");// Username field cannot be empty
		} else {
			System.out.println("Username is not empty");
		}

		if (userNAme.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password  cannot be empty");
		} else {
			System.out.println("Username or password is not empty"); // Username or password cannot be empty
		}
		
		if(userNAme.length() == 0) {
			System.out.println("Username length is zero (0), so it is empty!");
		}
		
		
		//MAC:     COMMAND + SHIFT + F    coding formatindaki son degisikleri orjinal haline getirir
				//WINDOWS: CTRL + SHIFT + F
	}

}
