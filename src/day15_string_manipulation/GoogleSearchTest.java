package day15_string_manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		
		String item = "java";
		String pageTitle = item + " - Google search"; // goggleda "java"yi search ettitrirsen browserda bu cikar.
		
		
		//test if pageTitle starts with item
		
		if(pageTitle.startsWith(item)){ //burada item "java".. yani parantez icine java da yazabilirdik
			System.out.println("Page title check passed");
		}else {
			System.out.println("Fail: Page title check failed");
		}
		
		if(pageTitle.endsWith("Google search")) {
			System.out.println("PASS: Google search is in the title");
		}else {
			System.out.println("FAIL: Google search is not in the title");
		}
		
	}

}
