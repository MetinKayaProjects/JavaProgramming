package day47_blocks;

import static day47_blocks.BriteERP.*; //omport static + packageName+ClassNAme

public class BriteERPLoginTest {
	public static void main(String[] args) {
		//call static method. ClassName.Method.Name
		BriteERP.enterEmail();
		BriteERP.enterPAssword();
		BriteERP.verifyLogin();
		
		System.out.println();
		
		
// yukariya package ve class (BriteERP) import edilince Class ismini yazmaya gerek yok
		enterEmail();
		enterPAssword();
		verifyLogin();
		
		
	}

}
