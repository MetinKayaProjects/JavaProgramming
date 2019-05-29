package day49_inheritance02;

public class BarnesAndNobles {
	public static void main(String[] args) {
		
		EBook ebook = new EBook();
		//from Book class
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setType("Tech Book");
		ebook.setPrice(170);
		//from EBook classes
		ebook.setSize(500);
		ebook.setPages(1016);
		
		System.out.println();
		
		System.out.println(ebook.getTitle());//Introduction to Java
		System.out.println(ebook.getAuthor());//Savitch
		System.out.println();
		
		ebook.readEbook(10); //public void readEbook(int pageNum)//eBook
		ebook.readEbook(234);
		
		System.out.println();
		
		AudioBook aBook = new AudioBook();
		aBook.setAuthor("Savitch");
		aBook.setTitle("Java Book");
		aBook.setType("novel");
		aBook.setNarrator("Marufjan");
		//from audioBook class
		aBook.setPrice(10);
		aBook.setLength(12);
		System.out.println(aBook.getAuthor());//Ali
		System.out.println(aBook.getPrice());//10
		
		aBook.listen();//Listening to Java Book by Savitch and narrated by Marufjan
		
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Molcom Gladwill");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		
		System.out.println(pb.toString());
		
		
	}

}
