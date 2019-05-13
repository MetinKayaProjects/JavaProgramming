package day36_wrapperclasses_arraylistintro;


public class Boxing {
	public static void main(String[] args) {
		//AUTOBOXING is converting from Primitive to WrapperClass Object
		
		int n = 5;         //pritimive to wrapper Class
		Integer num = n;
		System.out.println("n: " + n);
		System.out.println("num: " + num);
		
		System.out.println();
		
		//UNBOXING is converting from object to primitve type
		Double d1 = new  Double(34.2);  //object to primitive
		double d2 = d1;
		
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		
		long l1 = new Long(6000000);  //unboxing
		Long l2 = new Long(233456776); // no boxing
		long l3 = l2; //unboxing
		Long l4 = l3; //autoboxing: from primitive to object
		
		
	//	Integer num3 = 34;
		Integer num3 = Integer.valueOf(34);
	
//		Double d3 = num3; // casting is not possible in wrapper classes
	}

}
