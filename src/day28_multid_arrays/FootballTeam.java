package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeam {
	public static void main(String[] args) {
		// declare MultiD Array and assign the value
		String[][] teams = new String[2][6]; // we have 2 teams and 6 players in each teams

		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";

		teams[1][0] = "Olimjon";
		teams[1][1] = "Misrshad";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";

		System.out.println("How many team are there: " + teams.length);
		
		System.out.println("Team 0: ");
		for (int i = 0; i < teams.length-1; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				System.out.println(i + " " + j + " - " + teams[i][j]);
			}

		}
		System.out.println();
		
		System.out.println("Team 1: ");
		for (int i = 1; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				System.out.println(i + " " + j + " - " + teams[i][j]);
			}

		}

		System.out.println();
		// print it out

		System.out.println("First player of first team");
		System.out.println(teams[0][0]); // Irina

		System.out.println("First player of second team");
		System.out.println(teams[1][0]); // Olimjon

		System.out.println(teams[0][3]); // Habib

		System.out.println(teams[1][5]); // Dmitriy

		System.out.println("First team's size-number of players: " + teams[0].length); // 6
		System.out.println("Second team's size-number of players: " + teams[1].length); // 6
		System.out.println("The number of rows: " + teams.length); // 2

		// print how many rows/teams/arrays

		System.out.println("How many rows: " + teams.length); // How many rows: 2
		System.out.println("How many players in the team1: " + teams[0].length); // How many players in the team1: 6
		System.out.println("How many players in the team1: " + teams[1].length); // How many players in the team1: 6

		System.out.println(Arrays.deepToString(teams));
//		[[Irina, Zarif, Cihan, Habib, Adel, Bojan], [Olimjon, Misrshad, Usman, Nursultan, Roman, Dmitriy]]

		System.out.println(Arrays.toString(teams[0]));
//		[Irina, Zarif, Cihan, Habib, Adel, Bojan]

		System.out.println(Arrays.toString(teams[1]));
//		[Olimjon, Misrshad, Usman, Nursultan, Roman, Dmitriy]

	}

}
