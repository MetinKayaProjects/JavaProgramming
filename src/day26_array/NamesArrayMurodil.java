package day26_array;

import java.util.Arrays;
import java.util.Random;


public class NamesArrayMurodil {
	public static void main(String[] args) {
		
		String[] names = {  "James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
//Print number of names in the array.
System.out.println("Total names: " + names.length);
//print all names in single line
System.out.println(Arrays.toString(names));
//Print in column format.
//2 names in each line.
//James, Mary
//John, Patricia

for(int i = 0; i < names.length; i+=2) {
System.out.println(names[i]+", "+ names[i+1]);
}

//print male names in single line separated by comma
System.out.println("MALE NAMES: ");
for(int m = 0; m < names.length; m+=2) {
System.out.print(names[m]+", ");
}
//print female names in single line separated by comma
System.out.println("\nFEMALE NAMES:");
for(int idx = 0; idx < names.length; idx++) {
if(idx % 2 != 0) {
	if(idx == names.length -1) {
		System.out.print(names[idx]);	
	}else {
		System.out.print(names[idx]+", ");
	}
}
}

//PRINT one random name from this array
//use Random class
System.out.println("\nRANDOM NAME:");
Random random = new Random();
int r = random.nextInt(names.length);
System.out.println("Random name: " + names[r]);

//PRINT all names that are up to 4(incl) characters, in uppercase, in same line
for(String name : names ) {
if(name.length() <= 4 ) {
	System.out.print(name.toUpperCase() + ", ");
}
}

System.out.println("\nNAMES LENGTH SORT");
String namesUpto4 = "";
String names5to6 = "";
String names7orMore = "";

for(String name : names) {
if(name.length() <= 4) {
	namesUpto4 += name + ", ";
}else if(name.length() == 5 || name.length() == 6) {
	names5to6 += name + ", ";
}else {
	names7orMore += name + ", ";
}
}

System.out.println("namesUpto4: "+ namesUpto4.substring(0, namesUpto4.length()-2));
System.out.println("names5to6: "+ names5to6);
System.out.println("names7orMore: "+ names7orMore);

//SWAP seats 
System.out.println(Arrays.toString(names));
//CODE HERE James, Mary,
for(int i = 0; i < names.length; i+=2) {
String temp = names[i];
names[i] = names[i+1];
names[i+1] = temp;	
}
System.out.println(Arrays.toString(names));


String str1 = "first word";
String str2 = "second word";

String temp = str1;
str1 = str2;
str2 = temp;

System.out.println("str1 - " + str1);
System.out.println("str2 - " + str2);


//				
	}

}
