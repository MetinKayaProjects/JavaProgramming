package day08_casting_conditionals;


public class IfElseWithVariables {
	public static void main(String[] args) {
		
		
		int temperature = 45;
		
		
		if(temperature >=65) {
			
			System.out.println("It is a nice day! Let's play soccer"); //65 ve ustu degerlerde bunu yazdirir
			
		}else {
			System.out.println("Stay at home and code java"); //65 altinda bunu yazdirir
		}
		
		
	
		
		//2 int variables, teamAScor, teamBScore,
		// put a condition. check if temaA won. "Team A Won".
				//"TEam A won"
				// go to Team A!
		// else "team B won or it was a drawn
				//Go Teams!
		
		int teamAScore = 5;
		int teamBScore = 9;
		
		if(teamAScore > teamBScore) {
			System.out.println("Team A won!");
			System.out.println("Go Team A!");
		}else {
			System.out.println("Team B won or it was a draw");
			System.out.println("Go Teams!");
		}
		
		
		
		
		
		
	}

}
