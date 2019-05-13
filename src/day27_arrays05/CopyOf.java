package day27_arrays05;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
		
		
		
		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 = d1;
		
		System.out.println(Arrays.toString(d1));  //[2.3, 4.5, 12.4]
		System.out.println(Arrays.toString(d2));  //[2.3, 4.5, 12.4]
		
		d1[0] = 1000.3;
		System.out.println(Arrays.toString(d1));  //[1000.3, 4.5, 12.4]
		System.out.println(Arrays.toString(d2));  //[1000.3, 4.5, 12.4]
		
		
		d2[1] = 400.5;
		System.out.println(Arrays.toString(d1));  //[1000.3, 400.5, 12.4]
		System.out.println(Arrays.toString(d2));  //[1000.3, 400.5, 12.4]
		
		double[] d3 = Arrays.copyOf(d2, d2.length); //d2 copied to d3
		System.out.println(Arrays.toString(d3)); //[1000.3, 400.5, 12.4]
		
		d3 = Arrays.copyOf(d1, 2);
		System.out.println(Arrays.toString(d3));  //[1000.3, 400.5]
		
	}

}
