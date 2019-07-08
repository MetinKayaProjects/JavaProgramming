package day63_exceptions02;

import java.io.IOException;

import day62_exceptions01.RunTimeError;

public class ThrowAndThrows {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");	
		
//		throw new RuntimeException("This is thrown using throw keyword");
		
//		String userName= "user01";
		String userName= "";
		if (userName.isEmpty()) {
			throw new RuntimeException("UserName cannot be empty");
			
		}else {
			System.out.println("Valid username");
		}
		//throwing checked exception
		//handle - declare. otherwise it will not compile
		try {
			throw new Exception(); //doen not compile
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");
		}
		
		sleep(2); //declare throws at main method definition line
		
		//or
		try {
			sleep(3);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	//declaring by throws keyword
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(3000);
		
	}
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
		
		//or
		try {
			sleep(seconds);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
		
	

}
