package day27_arrays05;

import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.type.DeclaredType;

public class TimesArray2_ByScanner {
	public static void main(String[] args) {
		
//		Declare 2 int arrays time1 and time2
//		both of them have 2 values/items that represent hour and minute
//		hours:1-24
//		minuetes: 0-59
		
//		exp-> time1={11,40}						time1={11,40}				time1={11,40}
//			  time2={15,25}						time2={11,25}				time2={11,40}
//			  Print "Time1 is earlier"			Print "Time2 is earlier"    Print "equal times
		
		int[] time1 = new int[2];
		int[] time2 = new int[2];
//		int[] time1 = {11,40};
//		int[] time2 = {15,25};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the hour1");
		time1[0] = scan.nextInt();  // hour  
		System.out.println("Enter the minute1");
		time1[1] = scan.nextInt();;  //minute

		System.out.println("Enter the hour2");
		time2[0] = scan.nextInt();
		System.out.println("Enter the minute2");
		time2[1] = scan.nextInt();

			
		//before comparing check both arrays have valid values (hours and minutes)
		
		if(time1[0]<0 || time1[0]>23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time1[0]<0 || time1[0]>59) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time2[0]<0 || time2[0]>23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time2[0]<0 || time2[0]>59) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
//		COMPARE ARRAYS and tell which one is earlier
//		1st compare hours:
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}else if (time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}else {   //hours are equal, check minutes
			if (time1[1] < time2[1]) {
				System.out.println("time1 ie earlier");
			}else if(time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("same time!");
			}
		}
		
		
		
		
		
	}

}
