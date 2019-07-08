package day63_exceptions02;
//Custom Checked Exception
public class NeedSomeCoffeeException extends Exception{
	public NeedSomeCoffeeException() {
		
	}
	public NeedSomeCoffeeException(String message) {
		super(message);
	}

}
