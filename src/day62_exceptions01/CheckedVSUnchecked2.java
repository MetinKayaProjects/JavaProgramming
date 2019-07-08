package day62_exceptions01;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVSUnchecked2 {
	public static void main(String[] args) throws InterruptedException, MalformedURLException  {
		//checked exception - InterruptedException
		//HANDLE-OR-DECLARE  (2 options)
		//1.DECLARE --> throws InterruptedException'u ekleyerek
		//2.HANDLE --> try&catch
		
//		1.DECLARE --> throws InterruptedException'u ekleyerek
			System.out.println("Sleeping");
			Thread.sleep(2000);
		
		
		System.out.println("Woke up");
		
			URL url = new URL("https://google.com");
			System.out.println(url.toString());
		
	}

}
