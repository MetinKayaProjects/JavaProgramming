package day49_inheritance02;

public class EBook extends Book {
	private double size;
	private int pages;
	
	public void readEbook(int pageNum) {
		//reading java book by Savitch at page 10
		System.out.println("reading " + getTitle() + " book by " + getAuthor() + " at page " + pageNum );
	}
	
	
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
