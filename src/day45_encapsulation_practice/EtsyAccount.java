package day45_encapsulation_practice;

import java.util.Random;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;

	// add getter setter,
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		// if it contains @ somewhere in the middle, assign it. it shouldn't be at the
		// first or last index.
//		if not print "Please enter a valid email address"

		if (email.indexOf('@') >= 1 && email.indexOf('@') < email.length() - 1) {
			this.email = email;

		} else {
			System.out.println("Please enter a valid email address");
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		// can/t be blank
		// needs to be only alphabetic
		if (isValidFirstName(firstName)) {
			this.firstName = firstName;
		} else {
			System.out.println("Your first name contains invalid characters.");
		}
	}

	// valid => all letters, can have space in the middle
	// invalid => cannot contains numbers or any other chars
	private boolean isValidFirstName(String firstName) {
		// check first if it starts with or ends with space
		// return false if true
		if (firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		if (firstName.isEmpty()) {
			return false;
		}

		// invalid => cannot contains numbers or any other chars
		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Must be at least 6 characters");
			this.password = "";
		} else {
			this.password = password;
		}
	}

//	add toString 
	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

// add Constructor
	// constructor-1 no-args
	public EtsyAccount() {
		//System.out.println("No-args constructor");
		this.email = "";
		this.firstName = "";
		this.password = "";
	}

//constructo-2 one-args and sets them to instance variables exp: set(email)
	public EtsyAccount(String email) {
//		this.email = email;
//		this.firstName = "";  //up to you to write this
//		this.password = "";
		setEmail(email);  //call the setter : setEmail(email)

	}

	// constructo-2 two-args and sets them to instance variables
	//password is auto generated and assigned
	public EtsyAccount(String email, String firstName) {
//		this.email = email;
//		this.firstName = firstName;
//		this.password = "";
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword(); // random, password with 6 characters
		
	}
	//method for random password
	private String getRandomPassword() {
        Random rd = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
       
        String rdPassword = "";
        for(int i=1; i <= 6; i++){  //password is 6 characters.
        	int idx = rd.nextInt(letters.length());
        	rdPassword += letters.charAt(idx);
        	//rdPassword += letters.charAt(rd.nextInt(letters.length()));
        }return rdPassword;
    }

	public EtsyAccount(String email, String firstName, String password) {
//		this.email = email;
//		this.firstName = firstName;
//		this.password = password;

		this.setEmail(email); // this is also welcome
		setFirstName(firstName);
		setPassword(password);
	}
	 

}
