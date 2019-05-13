package day16_strin_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", ""); 
		System.out.println(withNoSpaces);   //Codingisfun,itismyhobby!!
		
		System.out.println(sentence); //Coding is fun, it is my hobby!!
		//replace , with !!!
		sentence = sentence.replace("," , "!!!");
		System.out.println(sentence); //Coding is fun!!! it is my hobby!!
		
		String mixed = "&^@#j$a-v|a@#$";
		//clean up mixed
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);//j$a-v|a
		
		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("|", "");
		//mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("a", "");
		System.out.println(mixed);
		
		String result = "About 115,000,000 results (0.56 seconds)";
		
		//using string methods (replace, substring), get number of results
		//115,000,000 alinacak. 059 degisebilir.
		
		//result = result.replace("About ", "").replace(" results (0.59 seconds)", "");//011 degisince hata verir
		result = result.replace("About ", "");
		System.out.println(result);  //115,000,000 results (0.56 seconds)
		result = result.substring(0, result.indexOf(" ")); //115,000,000'den sonraki ilk bosluk
		
		System.out.println(result); //115,000,000  //0.56 degisse de bu rakami verir.
		
		result = result.replaceFirst(",", "");
		System.out.println(result); //115000,000
		
	
		
		result = result.replace(",", "");
		System.out.println(result); //115000000
		
		
		
	}

}
