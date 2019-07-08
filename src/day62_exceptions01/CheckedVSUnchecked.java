package day62_exceptions01;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVSUnchecked {
	public static void main(String[] args)  {
		//checked exception - InterruptedException
		//HANDLE-OR-DECLARE  (2 options)
		//1.DECLARE --> throws InterruptedException'u ekleyerek
		//2.HANDLE --> try&catch
		
		try {
			System.out.println("Sleeping");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Thread is interrupted!");
		}
		
		System.out.println("Woke up");
		
		try {
			URL url = new URL("https://google.com");
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("invalid url");
		}
	}

}
