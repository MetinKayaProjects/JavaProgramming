package day44_encapsulate_constructor;

import java.util.*;;

public class WhatsApp {
	
	private String toNumber;
	private String message;
	private boolean delivered;
	
	//this() key word with parenthesis
	//1st constructor
	public WhatsApp() {
		
		System.out.println("No-args constructor" +toNumber + message);
	}
	//2nd constructor
	public WhatsApp(String toNumber, String messageString) {
		this();
		System.out.println("2 args constructor" + toNumber + message);
		this.message = message;
		this.toNumber = toNumber;
		
	}
	//3rd constructor
	public WhatsApp(String toNumber) {
		//this(); "unknown"
		this(toNumber, "[]");
//		this.toNumber = toNumber;
//		this.message = "[]";
		System.out.println("1 arg constructor " + toNumber +message);
				
	}
	
	
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	@Override
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	
	
	

}
