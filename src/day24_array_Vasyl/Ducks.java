package day24_array_Vasyl;

public class Ducks {
	public static void main(String[] args) {
		int[][] ducks = {{1,2,3,4,5}, 
						 {6,7,8,9,10},
						 {11,12,13,14,15}};
//		int[][] ducks = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}}; bu sekilde de yazilabilirdi.
		
		System.out.println(ducks.length);  		// 3
		System.out.println(ducks[0].length);	//5
		System.out.println(ducks[0][4]);		//5  ... o'inci satirin 4'uncu indexinde 5 var
		System.out.println(ducks[1][3]);		//9
		System.out.println(ducks[2][3]);		//14
		
		int nums[][] = new int [5][5];
	}

}
