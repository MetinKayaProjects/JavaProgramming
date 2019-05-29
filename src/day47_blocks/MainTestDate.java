package day47_blocks;

public class MainTestDate {
	public static void main(String[] args) {

		// how do i print out url from TestDate class
		// from static class to static class
		System.out.println(TestData.url); // http://54.148.96.210/

		String briteEepUrl = TestData.url;

		System.out.println(briteEepUrl); // http://54.148.96.210/

		System.out.println(TestData.email);
		// how can i access to email by object
//		TestData td = new TestData();  //Test Data icinde private TestData class olusturulunca yeni object olusturamiyourz
//		System.out.println(td.email); // in_manuf_manager4@info.com

	}

}
