package day20_forLoops;

public class WeekDays {
	public static void main(String[] args) {
		
		// For Loop: 1-7
		//1 - Monday
		//2 -Tuesday etc
		
		for(int i=1; i<=7; i++) {
			if(i==1) {
				System.out.println(i + " - Monday");
			}else if(i == 2) {
				System.out.println( i+ " - Tuesday");
			}else if(i == 3) {
				System.out.println( i+ " - Wednesday");
			}else if(i==4) {
				System.out.println( i+ " - Thursday");
			}else if(i==5) {
				System.out.println( i+ " - Friday");
			}else if(i==6) {
				System.out.println( i+ " - Saturday");
			}else if(i==7) {
				System.out.println( i+ " - Sunday");
			}
		}
		
		System.out.println("\n*** by switch ***\n");
		//2nd way by switch
		
		for(int j=1; j<=7; j++) {
			switch(j) {
			case 1:
				System.out.println(j + " - Monday");
				break;
			case 2:
				System.out.println( j+ " - Tuesday");
				break;
			case 3:
				System.out.println( j+ " - Wednesday");
				break;
			case 4:
				System.out.println( j+ " - Thursday");
				break;
			case 5:
				System.out.println( j+ " - Friday");
				break;
			case 6:
				System.out.println( j+ " - Saturday");
				break;
			case 7:
				System.out.println( j+ " - Sunday");
				break;
				
			}
		}
		
		
		
	}

}
