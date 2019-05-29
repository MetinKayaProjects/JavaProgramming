package day47_blocks;

public class VariableAccess {
	
	// declare instance varibla
	int myInstanceVar = 40;
	
	//declare static variable
	static int myStaticVariable = 55;
	
	
	
	public static void main(String[] args) {
		
		//System.out.println(myInstanceVar);   // does not compile. 
//		since static method cannot access to non-static method. myInstanceVar is non-static. 
		System.out.println(myStaticVariable); //55
		
		//How can access to non-static to static
		//create object VariableAccess and print myInstanceVar.... To access to non-static var
		
		VariableAccess v = new VariableAccess(); //we declared object
		System.out.println(v.myInstanceVar); //40
		//acccess static variable using object
		System.out.println(v.myStaticVariable); //55
		//access static variable using class name
		System.out.println(VariableAccess.myStaticVariable);//55
		
	}

}
