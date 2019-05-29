package day46_static_keyword;

public class CompanyTest {
	public static void main(String[] args) {
		
		
		//print cname variable value
		System.out.println("Company name: " + Company.cname);//Company name: Deloitte
		System.out.println("Company name: " + Company.cname.toUpperCase()); //Company name: DELOITTE
		
		//Company.cname.toUpperCase();   >>>> Class way
		System.out.println(Company.cname.toUpperCase());//DELOITTE
		
		System.out.println();
		
		Company c = new Company();
		System.out.println(c.cname);//Deloitte  >>>object way
		
		System.out.println(c.cname.toUpperCase()); //DELOITTE
		
		c.companyInfo();  //Company name is : Deloitte
		
		System.out.println();
		
		Company.companyInfo();
		System.out.println(Math.round(455.6322));
		
		
		
	}

}
