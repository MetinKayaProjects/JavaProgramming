package day47_blocks;

public class MainTestData {
	public static void main(String[] args) {

		// how do i print out url from TestDate class
		// from static class to static class
		System.out.println(TestData.url); // http://54.148.96.210/

		String briteErpUrl = TestData.url;

		System.out.println(briteErpUrl); // http://54.148.96.210/

		System.out.println(TestData.email);
		
		// how can i access to email by object
//		TestData td = new TestData();  //Test Data icinde private TestData class olusturulunca yeni object olusturamiyourz
//		System.out.println(td.email); 

	}

}
