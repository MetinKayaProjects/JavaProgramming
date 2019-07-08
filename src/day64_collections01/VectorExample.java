package day64_collections01;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<String> v = new Vector<String>();
		v.add("monday");
		v.add("tuesday");
		v.add("wednesday");
		v.add("thursday");
		
		System.out.println(v.toString());//[monday, tuesday, wednesday, thursday]
		
		for(String s:v) {
			System.out.println(s);
		}
		
		System.out.println(v.size()); //4
		System.out.println(v.get(3));//thursday
		
		v.remove(0);
		System.out.println(v.toString());//[tuesday, wednesday, thursday]
	}

}
