package day64_collections01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> numsStack = new Stack<Integer>();
		numsStack.add(50);
		numsStack.push(20);
		numsStack.push(40);  //last in first out
		
		System.out.println(numsStack.toString()); //[50, 20, 40]
		
		System.out.println(numsStack.peek());  //40    last in 
		
		System.out.println(numsStack.pop()); //40  //removed  40  first out
		
		System.out.println(numsStack.toString());//[50, 20]
		
		System.out.println(numsStack.peek());//20
		
		System.out.println(numsStack.get(0));//50
		
		
	}

}
