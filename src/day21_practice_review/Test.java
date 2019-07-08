package day21_practice_review;

public class Test {
public static void main(String[] args) {
	
	int x = 100;
	int a = x++;
	int b = ++x;
	int c = x++;
	
	int d = (a<b)?(a<c)?a:(b<c)?b:c:x;
	System.out.println(d);	
	
}
}
