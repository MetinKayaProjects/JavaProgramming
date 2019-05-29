package day47_blocks;

public class AllBlocks {
	
	int nonstatic = 10;
	static int staticInt = 10;
	static {
		System.out.println("STATIC BLOCK = I run first and only one");
		staticInt--;
	}
	
	{
		System.out.println("INIT BLOCK - I run each time object is created. Before construction");
		nonstatic +=5;
		staticInt +=5;
	}
	
	public AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time object is created. After initBlocks");
		nonstatic +=3;
		staticInt +=3;
	}

}
