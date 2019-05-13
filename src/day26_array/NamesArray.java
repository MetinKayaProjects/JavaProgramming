package day26_array;

import java.util.*;

public class NamesArray {
	public static void main(String[] args) {
		
			  String[] names = {"James","Mary",
								"John","Patricia",
								"Robert","Jennifer",
								"Logan","Lori",
								"Bobby","Alexis",
								"Harry","Tiffany",
								"Johnny","Kayla"};
		
		System.out.println("\ntotal names in the list: " + names.length);//14
		
		System.out.println(Arrays.toString(names)); //  1st way to print out the names in the String array, we convert from Array to String!
		
		for(String name: names) {					// 2nd way : for each is also another method to print out an ARRAY list.
			System.out.print(name+", ");
		}
		
		System.out.println();						//3rd way to print out the names
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + ", ");
		}
		
		System.out.println("\n*************print  names in each line");
		for(int i=0; i<names.length; i=i+2) {
			System.out.println(names[i]+ " - " +names[i+1]);	
		}
//		James - Mary
//		John - Patricia
//		Robert - Jennifer
//		Logan - Lori
//		Bobby - Alexis
//		Harry - Tiffany
//		Johnny - Kayla
		
		
		System.out.println("\n***********print males in each lines");
		for(int i=0; i<names.length; i=i+2) {
			System.out.println(names[i]);
		}
					
		System.out.println("\n*************print females in each lines");
		for(int i=0; i<names.length; i=i+2) {
			System.out.println(names[i+1]);
		}			
		
		System.out.println("\n**** 2nd way for female names");
		
		for(int m=0; m < names.length; m++) {
			if(m %2 !=0) {
				if(m == names.length-1) {
				System.out.print(names[m]);
			}else {
				
				System.out.print(names[m] + " ");
			}
		}
		}			
			//print one random name from this array
			//use Random class
			System.out.println("\n\n____________  Random NAme__________");
			Random random = new Random();
			int r = random.nextInt(names.length);
			
			System.out.println("Random name: " + names[r]);  //each time print out different names
			
			//Print all names that are up to 4 characters, in uppercase, in same line
			System.out.println("\n*** all names that are up to 4 characters *** \n");
			for(String name: names) {
				if(name.length()<=4) {
					System.out.print(name.toUpperCase() + ", ");
				
				}
			}
			
			System.out.println(" \n\n********** NAMES LENGTH SORT *********\n");
				String namesUpto4 = "";
				String names5to6 = "";
				String names7orMore = "";
				
				for(String name : names) {
					if(name.length() <= 4) {
						namesUpto4 += name + ", ";
						
					}else if(name.length()>=5 && name.length()<=6) {
						names5to6 += name + ", ";
						
					}else{
						names7orMore += name + ", ";
						
					}
				}
				System.out.println("- namesUpto4: " + namesUpto4.toUpperCase().substring(0, namesUpto4.length()-2));  //-2 is to remove the space and comma
				System.out.println("- names5to6: " +names5to6.toUpperCase().substring(0, names5to6.length()-2));
				System.out.println("- names7orMore: " + names7orMore.substring(0,names7orMore.length()-2).toUpperCase());
				
				System.out.println("\n\n *** Swap males and females****\n");
					//switch the males with females
					//"James","Mary"  --> "Mary","James",
			
				System.out.println("Before SWAP: " + Arrays.toString(names));
				
				String temp = "";
				for(int i=0; i < names.length; i=i+2) {
					temp = names[i];
					names[i]=names[i+1];
					names[i+1]= temp;
					System.out.println(names[i] + " - " + names[i+1]);
				}
				System.out.println("After SWAP: " + Arrays.toString(names)); 
				
				
				System.out.println("\n*** SWAP METHOD ***");
				String str1 = "first word";
				String str2 = "second word";

				String temp1 = str1;
				str1 = str2;
				str2 = temp1;

				System.out.println("str1 - " + str1);
				System.out.println("str2 - " + str2);
	}

}
