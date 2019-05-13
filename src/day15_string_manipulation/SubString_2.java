package day15_string_manipulation;

public class SubString_2 {
	public static void main(String[] args) {
	
		
		String chars = "<<>>";
		System.out.println(chars.substring(0));    //0'dan itibaren yazdirir... <<>>
		System.out.println(chars.substring(0,3));  //[0,3) yani0 ve 2 dahil arasini  arasini yazdirir. <<>
		System.out.println(chars.substring(1,4));  //bos. cunku index 4'te character yok
		
		
		String word = "java";
		
		String result = chars.substring(0,2) + word + chars.substring(2); //<<java>>
		
		System.out.println(result);
		
		String chars2 = "{{}}";
		String word2 = "Automation";
		

		String result2= chars2.substring(0,2) + word2 + chars.substring(2);
		System.out.println(result2);
	}

}
