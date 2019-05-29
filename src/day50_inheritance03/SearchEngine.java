package day50_inheritance03;

public class SearchEngine {
	
	//public
	public int search(String item) {
		System.out.println("Seraching for : " + item);
		int resultsCount = item.length();
		return resultsCount;
		
	}
	//protected
	protected void search(String item, String item2) {
		System.out.println("Seraching for : " + item + ", " + item2);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total count: " + resultsCount);
	}
	//default
	String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}

}
