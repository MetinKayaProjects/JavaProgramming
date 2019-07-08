package day63_exceptions02;
//Custom Unchecked Exception
public class InsufficientFundsException extends RuntimeException {


	public InsufficientFundsException() {

	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}
