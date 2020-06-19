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
	
	//Test
public static void main(String[] args) {
		
		AllBlocks all1 = new AllBlocks();
		System.out.println();
		AllBlocks all2 =new AllBlocks();
		System.out.println();
		AllBlocks all3 = new AllBlocks();
		
		
//				STATIC BLOCK = I run first and only one
//				INIT BLOCK - I run each time object is created. Before construction
//				CONSTRUCTOR - I run each time object is created. After initBlocks
//
//				INIT BLOCK - I run each time object is created. Before construction
//				CONSTRUCTOR - I run each time object is created. After initBlocks
//
//				INIT BLOCK - I run each time object is created. Before construction
//				CONSTRUCTOR - I run each time object is created. After initBlocks
		
//		Static Block run first but only one time. burada iki defa object call yapti sadece ilkinde geldi
//		initBlock runs each time before constructor. iki object ile de geldi.
//		constructor, her obje cagirdiginda intBlock'dan sonra geldi.
		
		System.out.println(all1.nonstatic);
		System.out.println(all1.staticInt);
		
		System.out.println(all2.nonstatic);
		System.out.println(all2.staticInt);
		
		System.out.println(AllBlocks.staticInt);
	}
}
