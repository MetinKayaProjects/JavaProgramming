package day56_abstraction_02;

import day56_abstraction_02_2.Nokia;

public class TestBrowsers {
	public static void main(String[] args) {
		// Browser br = new Browser();
		Browser.id = 100;
		System.out.println(Browser.id);  //100
		Integer integer;
		
		System.out.println("\nChrome............");
		
		Chrome chrome1 = new Chrome("MyTv", 120);
		System.out.println(chrome1.name);//MyTv
		System.out.println(chrome1.id);//120
		chrome1.close();//Exitting the browser   is called by super.close();
						//Exitting Chrome
		chrome1.navigate("www.mytv.com"); //Chrome - navigating to www.mytv.com
		chrome1.displayWebpage();//Chrome - displaing webPage: MyTv
		System.out.println(chrome1.launch());//Chrome is launching
											//1 2 3
		
		
		System.out.println("\\nNetscape..............");
		Netscape net = new Netscape("MyNetscape", 2342);
		System.out.println(net.name);//MyNetscape
		System.out.println(net.id);//2342
		net.close();//Exitting the browser
//					  Exitting the Netscape
		net.navigate("www.netscape.com");
		net.displayWebpage();
		System.out.println(net.launch());
	
	}
}