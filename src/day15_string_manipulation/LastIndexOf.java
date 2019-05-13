package day15_string_manipulation;

public class LastIndexOf {
	public static void main(String[] args) {
		
		String str = "Hello";
		int lastIndex = str.lastIndexOf('l');
		System.out.println(lastIndex);   //3 sondan gelirken ilk l'nin yeri    
		//System.out.println(str.lastIndexOf('l'));
		
		System.out.println(str.lastIndexOf('l' , 3));  //sondan gelirken 3 say (3 dahil) ilk l
		
		System.out.println(str.indexOf("l", 1)); //2:   1'den basla 1 dahil ilk l'nin yeri
		System.out.println(str.indexOf("l", 2)); //2:   2'den basla  2 dahil ilk l'nin yeri
		System.out.println(str.indexOf("l" , 3));//3:   3'den basla 3 dahil ilk l'nin yeri
		
		System.out.println(str.lastIndexOf('o'));//4:   o'nun yeri 
		
		
		
	}

}
