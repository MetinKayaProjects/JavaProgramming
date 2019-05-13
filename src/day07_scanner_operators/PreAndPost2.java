package day07_scanner_operators;

public class PreAndPost2 {
	public static void main(String[] args) {
		
int messages = 10;
	messages++; //11
	++messages; //12

System.out.println("Messages: " +messages);
		
System.out.println("=============================");

int readMessages = --messages; //12-1=11
System.out.println("Read Messages: " + readMessages);//11
System.out.println("Messages: " + messages); //11

System.out.println("=============================");
int unreadMessages = readMessages--;//11    readMessages ise 11-1=10
System.out.println("unreadMessages: " + unreadMessages);//11
System.out.println("readMessages: " + readMessages); //10

System.out.println("=============================");
int total = unreadMessages++ - readMessages--;

System.out.println("unreadMessages: " + unreadMessages);//12
System.out.println("readMessages: " + readMessages);//9
System.out.println("totalMessages: " + total);//1

System.out.println("=============================");

int count = 20;
int count2 = 10;
int totalCount = ++count + --count2;

System.out.println("count: "+ count);   //21
System.out.println("count2: " +count2); //9
System.out.println("totalCount: " + totalCount);//30

System.out.println("=============================");

int counta = 20;
int countb = 10;
int totalCount2 = counta++ + ++countb;//20+11=31

System.out.println("countA: "+ counta);   //21
System.out.println("countB: " +countb); //11
System.out.println("totalCount2: " + totalCount2);//31
		
System.out.println("=============================");

totalCount2 = --counta - ++countb; //20-12=8

System.out.println("counta: "+ counta);//20
System.out.println("countb: "+ countb);//12
System.out.println("totalCount2: "+ totalCount2);//8



		
		
		
		
		
		
		
		
		
	}

}
