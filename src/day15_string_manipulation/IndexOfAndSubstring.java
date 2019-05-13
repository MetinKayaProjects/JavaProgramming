package day15_string_manipulation;

public class IndexOfAndSubstring {
	public static void main(String[] args) {
		//indexOf with 2 inputs
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash: " + firstDash); //4
		
		//int secondDash = list.indexOf("-" , 5);//4'te dash vardi, 5'ten sonraki ilk - 
		int secondDash = list.indexOf("-", firstDash+1);
		System.out.println("Second dash: " + secondDash);//13
		
		//third Dash by using secondDash variable
		int thirdDash = list.indexOf("-", secondDash+1);//
		System.out.println("Third Dash: " +thirdDash); //21
		
		// find the last Dash
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last Dash: "+ lastDash); //29
		
		
		System.out.println("\n******    SubString   ********\n");
		System.out.println(list.substring(0)); 							//html-selenium-angular-jenkins-grid
		System.out.println(list.substring(firstDash)); 					//-selenium-angular-jenkins-grid
		System.out.println(list.substring(firstDash+1));				//selenium-angular-jenkins-grid
		System.out.println(list.substring(firstDash+1, 13));			//selenium
		System.out.println(list.substring(firstDash, secondDash));		//-selenium
		System.out.println(list.substring(firstDash+1, secondDash));	//selenium
		

	}

}
