package day46_static_keyword;

public class CampusRunner {
	public static void main(String[] args) {
		
		Campus campus1 = new Campus("McLean");
		Campus campus2 = new Campus("Chicago");
		Campus campus3 = new Campus("New Jersey");
		
		System.out.println(campus1.city);//New Jersey
//		
		Campus.campusInfo();  //Welcome to campus
		Campus.campusInfo();
		Campus.campusInfo();
////		Campus.campusInfo();
////		Campus.campusInfo();
		System.out.println(Campus.country); //Canada
		
	}

}
