package day38_arraylist03;
import java.util.*;
public class ContainsMethod_mtn {
	public static void main(String[] args) {
		
		 ArrayList<String> list1 = new ArrayList<>();
	        list1.add("Jan");
	        list1.add("Feb");
	        list1.add("Mar");
	        list1.add("Apr");
	        list1.add("May");
	        System.out.println(list1.toString());//[Jan, Feb, Mar, Apr, May]
	        ArrayList<String> list2 = list1;//list1, list2 point to same object 
	        //copy all values from list1
	        ArrayList<String> months = new ArrayList<>(list1); //copied list1 tolist2
	        System.out.println(months); //[Jan, Feb, Mar, Apr, May]
	        months.add("Jun");
	        months.add("Jul");
	        months.add("Aug");
	        System.out.println(months); //[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]
	       
	        System.out.println(months.contains("Jan")); //true
	        System.out.println(months.contains("Dec"));  //false
	        
	        
	        System.out.println(months.contains("jan"));  //false, since case sensitive
	        System.out.println(months.toString().toLowerCase().contains("jan")); //true
	        
	        System.out.println();
	        
	        //check if Feb is in 2nd index
	        System.out.println(months.indexOf("Feb")==1);  //true
	        System.out.println(months.get(1).equals("Feb"));  //true
		
	        System.out.println();
	        
	        ArrayList<String> month2 = new ArrayList<>(list1);
	        
	        System.out.println("Months:" + months.toString());
	        System.out.println("Month2:" + month2.toString());
	        
	        System.out.println();
	        
	        //check if months has all the values of Month2
	        if(months.containsAll(month2)) {
	            System.out.println("Months has all of Month2");
	        }else {
	            System.out.println("Some values are missing");
	        }
	        
	        System.out.println();
	        
	        //add one more Jan to month2
	        month2.add("Jan");
	        if(months.containsAll(month2)) {
	            System.out.println("Months has all of Month2");
	        }else {
	            System.out.println("Some values are missing");
	        }
	}

}
