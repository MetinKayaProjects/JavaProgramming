package day50_inheritance03;

public class Google extends SearchEngine {

	//-Overriding yaparken access processorun visibilitysini artirabiliriz, ama
	// dusuremeyiz
	//-return typ'i degistiremeyiz
	//-metod name'i degistiremeyiz
	//param type'i degistiremeyiz
	//ancak value (bu ornekte item) degistirilebilir

	// sadece item degistitilebilir:
//	public int search(String item) {
	public int search(String word) {
		System.out.println("Seraching for : " + word);
		int resultsCount = word.length();
		return resultsCount;

	}

	// this is protected in SearchEngine. We can change it with public. but not
	// difault or private
//	protected void search(String item, String item2) {
	public void search(String item, String str) {
		System.out.println("Seraching for : " + item + ", " + str);
		int resultsCount = item.length() + str.length();
		System.out.println("Total count: " + resultsCount);
	}

	// This is default in SearchEngine class. We can make it more visible by
	// changing w/ protected or public
	protected String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}

}
