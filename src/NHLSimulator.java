/* Name: Cathy Yan
 * Date: January 2019
 * CISC 124 Assignment 1: NHL Simulator
 *
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NHLSimulator {
	private List<Team> teams = new ArrayList<Team>();
	//private List<Player> players;
	//constructor
	ArrayList<Game> allGames = new ArrayList<Game>();
	public NHLSimulator() {
		teams = new ArrayList<Team>();

	}

	public ArrayList<Player> getTorontoPlayers() {
		//int numberPlayers = 0;
		ArrayList<Player> torontoPlayers = new ArrayList<Player>();
		//Team toronto;

		Player brown, ennis, gauthier, hyman, johnsson, kadri, kapanen, lindholm;
		Player marleau, marner, matthews, nylander, tavares, dermott, gardiner;
		Player hainsey, holl, marincin, ozhiganov, rielly, zaitsev, andersen;
		Player hutchinson, kaskisuo, sparks;


		//FORWARDS IN TORONTO TEAM
		brown = new Player(28, "C. Brown");
		ennis = new Player(63, "T. Ennis");
		gauthier = new Player(33, "F. Gauthier");
		hyman = new Player(11, "Z. Hyman");
		johnsson = new Player(18, "A. Johnsson");
		kadri = new Player(43, "N. Kadri");
		kapanen = new Player(24, "K. Kapanen");
		lindholm = new Player(26, "P. Lindholm");
		marleau = new Player(12, "P. Marleau");
		marner = new Player(16, "M. Marner");
		matthews = new Player(34, "A. Matthews");
		nylander = new Player(29, "W. Nylander");
		tavares = new Player(91, "J. Tavares");
		//DEFENSEMEN IN TORONTO TEAM
		dermott = new Player(23, "T. Dermott");
		gardiner = new Player(51, "J. Gardiner");
		hainsey = new Player(2, "R. Hainsey");
		holl = new Player(3, "J. Holl");
		marincin = new Player(52, "M. Marincin");
		ozhiganov = new Player(92, "I. Ozhiganov");
		rielly = new Player(44, "M. Rielly");
		zaitsev = new Player(22, "N. Zaitsev");
		//GOALIES IN TORONTO TEAM
		andersen = new Player(31, "F. Andersen");
		hutchinson = new Player(30, "M. Hutchinson");
		kaskisuo = new Player(50, "K. Kaskisuo");
		sparks = new Player(40, "G. Sparks");

		//Setting skill levels for each player in Toronto Team
		brown.setLevel(5);
		ennis.setLevel(4);
		gauthier.setLevel(5);
		hyman.setLevel(7);
		johnsson.setLevel(7);
		kadri.setLevel(7);
		kapanen.setLevel(8);
		lindholm.setLevel(8);
		marleau.setLevel(8);
		marner.setLevel(9);
		matthews.setLevel(9);
		nylander.setLevel(9);
		tavares.setLevel(10);
		//DEFENSEMEN IN TORONTO TEAM
		dermott.setLevel(8);
		gardiner.setLevel(4);
		hainsey.setLevel(5);
		holl.setLevel(6);
		marincin.setLevel(4);
		ozhiganov.setLevel(6);
		rielly.setLevel(9);
		zaitsev.setLevel(8);
		//GOALIES IN TORONTO TEAM
		andersen.setLevel(10);
		hutchinson.setLevel(7);
		kaskisuo.setLevel(5);
		sparks.setLevel(6);

		//Setting position for each player on Toronto Team
		brown.setPosition("Forward");
		ennis.setPosition("Forward");
		gauthier.setPosition("Forward");
		hyman.setPosition("Forward");
		johnsson.setPosition("Forward");
		kadri.setPosition("Forward");
		kapanen.setPosition("Forward");
		lindholm.setPosition("Forward");
		marleau.setPosition("Forward");
		marner.setPosition("Forward");
		matthews.setPosition("Forward");
		nylander.setPosition("Forward");
		tavares.setPosition("Forward");
		//DEFENSEMEN IN TORONTO TEAM
		dermott.setPosition("Defense");
		gardiner.setPosition("Defense");
		hainsey.setPosition("Defense");
		holl.setPosition("Defense");
		marincin.setPosition("Defense");
		ozhiganov.setPosition("Defense");
		rielly.setPosition("Defense");
		zaitsev.setPosition("Defense");
		//GOALIES IN TORONTO TEAM
		andersen.setPosition("Goalie");
		hutchinson.setPosition("Goalie");
		kaskisuo.setPosition("Goalie");
		sparks.setPosition("Goalie");


		torontoPlayers.add(brown);
		torontoPlayers.add(ennis);
		torontoPlayers.add(gauthier);
		torontoPlayers.add(hyman);
		torontoPlayers.add(johnsson);
		torontoPlayers.add(kadri);
		torontoPlayers.add(kapanen);
		torontoPlayers.add(lindholm);
		torontoPlayers.add(marleau);
		torontoPlayers.add(marner);
		torontoPlayers.add(matthews);
		torontoPlayers.add(nylander);
		torontoPlayers.add(tavares);
		torontoPlayers.add(dermott);
		torontoPlayers.add(gardiner);
		torontoPlayers.add(hainsey);
		torontoPlayers.add(holl);
		torontoPlayers.add(marincin);
		torontoPlayers.add(ozhiganov);
		torontoPlayers.add(rielly);
		torontoPlayers.add(zaitsev);
		torontoPlayers.add(andersen);
		torontoPlayers.add(hutchinson);
		torontoPlayers.add(kaskisuo);
		torontoPlayers.add(sparks);



		return torontoPlayers;
	}


	public void createTeams() {
		Team boston, buffalo, carolina, columbus, detroit, florida, montreal, jersey, islanders;
		Team rangers, ottawa, philadelphia, pittsburgh, tampabay, washington, toronto;

		boston = new Team("Boston");
		boston.setFSkillRange(new int[] {5,9});
		boston.setDSkillRange(new int[] {4,9});
		boston.setGSkillRange(new int[] {5,7});
		teams.add(boston);

		buffalo = new Team("Buffalo");
		buffalo.setFSkillRange(new int[] {6,9});
		buffalo.setDSkillRange(new int[] {4,7});
		buffalo.setGSkillRange(new int[] {4,7});
		teams.add(buffalo);

		carolina = new Team("Carolina");
		carolina.setFSkillRange(new int[] {4,8});
		carolina.setDSkillRange(new int[] {5,7});
		carolina.setGSkillRange(new int[] {4,9});
		teams.add(carolina);

		columbus = new Team("Columbus");
		columbus.setFSkillRange(new int[] {4,9});
		columbus.setDSkillRange(new int[] {5,8});
		columbus.setGSkillRange(new int[] {7,10});
		teams.add(columbus);

		detroit = new Team("Detroit");
		detroit.setFSkillRange(new int[] {4,7});
		detroit.setDSkillRange(new int[] {4,6});
		detroit.setGSkillRange(new int[] {4,6});
		teams.add(detroit);

		florida = new Team("Florida");
		florida.setFSkillRange(new int[] {5,7});
		florida.setDSkillRange(new int[] {4,8});
		florida.setGSkillRange(new int[] {5,9});
		teams.add(florida);

		montreal = new Team("Montreal");
		montreal.setFSkillRange(new int[] {4,7});
		montreal.setDSkillRange(new int[] {6,8});
		montreal.setGSkillRange(new int[] {4,9});
		teams.add(montreal);

		jersey = new Team("New Jersey");
		jersey.setFSkillRange(new int[] {4,7});
		jersey.setDSkillRange(new int[] {4,7});
		jersey.setGSkillRange(new int[] {5,6});
		teams.add(jersey);

		islanders = new Team("NY Islanders");
		islanders.setFSkillRange(new int[] {6,8});
		islanders.setDSkillRange(new int[] {5,7});
		islanders.setGSkillRange(new int[] {6,8});
		teams.add(islanders);

		rangers = new Team("NY Rangers");
		rangers.setFSkillRange(new int[] {5,7});
		rangers.setDSkillRange(new int[] {4,6});
		rangers.setGSkillRange(new int[] {5,7});
		teams.add(rangers);

		ottawa = new Team("Ottawa");
		ottawa.setFSkillRange(new int[] {4,6});
		ottawa.setDSkillRange(new int[] {4,5});
		ottawa.setGSkillRange(new int[] {4,5});
		teams.add(ottawa);

		philadelphia = new Team("Philadephia");
		philadelphia.setFSkillRange(new int[] {4,6});
		philadelphia.setDSkillRange(new int[] {4,6});
		philadelphia.setGSkillRange(new int[] {4,7});
		teams.add(philadelphia);

		pittsburgh = new Team("Pittsburgh");
		pittsburgh.setFSkillRange(new int[] {6,10});
		pittsburgh.setDSkillRange(new int[] {4,7});
		pittsburgh.setGSkillRange(new int[] {5,7});
		teams.add(pittsburgh);

		tampabay = new Team("Tampa Bay");
		tampabay.setFSkillRange(new int[] {6,10});
		tampabay.setDSkillRange(new int[] {6,10});
		tampabay.setGSkillRange(new int[] {7,9});
		teams.add(tampabay);

		washington = new Team("Washington");
		washington.setFSkillRange(new int[] {6,10});
		washington.setDSkillRange(new int[] {5,8});
		washington.setGSkillRange(new int[] {6,8});
		teams.add(washington);

		toronto = new Team("Toronto Maple Leafs");
		toronto.setPlayers(getTorontoPlayers());
		teams.add(toronto);

		/*
		int a = 0;
		Team currentTeam;
		String name = null;
		System.out.println("teams in eastern conference:");
		while (a < teams.size()) {
			currentTeam = teams.get(a);
			name = currentTeam.getName();
			System.out.println(name);
			a++;
		}
		*/
	}


	public int getPlayerNumber() {
		ArrayList<Integer> existingNumbers = new ArrayList<Integer>();
		boolean hasNewNumber = false;
		int newNumber = 0;

		while(!hasNewNumber) {
			newNumber = (int)(Math.random() * 99) + 1;

			if (!existingNumbers.contains(newNumber)) {
				existingNumbers.add(newNumber);
				hasNewNumber = true;
			}
		}

		return newNumber;
	}

	public void addPlayersToTeam() {
		createTeams();
		ArrayList<Player> currentPlayers = new ArrayList<Player>();
		Player currentPlayer;
		int min = 0;
		int max = 0;
		int range = 0;
		int skillLevel = 0;
		int playerNumber = 0;

		int i = 0;
		while (i < teams.size()) {
			Team current = teams.get(i);
			int[] fo = current.getFSkillRange();
			int[] de = current.getDSkillRange();
			int[] go = current.getGSkillRange();

			if (!current.getName().equals("Toronto Maple Leafs")) {

				int j = 0;
				while (j < 25) {

					if (j < 13) { //the player is a forward
						min = fo[0];
						max = fo[1];
						range = max - min + 1;
						skillLevel = (int)(Math.random() * range) + min;

						playerNumber = getPlayerNumber();
						currentPlayer = new Player(playerNumber, "F" + String.valueOf(playerNumber));
						currentPlayer.setPosition("Forward");
						currentPlayer.setLevel(skillLevel);

						currentPlayers.add(currentPlayer);
					}
					else if (j < 21) { //the player is a defense
						min = de[0];
						max = de[1];
						range = max - min + 1;
						skillLevel = (int)(Math.random() * range) + min;

						playerNumber = getPlayerNumber();
						currentPlayer = new Player(playerNumber, "D" + String.valueOf(playerNumber));
						currentPlayer.setPosition("Defense");
						currentPlayer.setLevel(skillLevel);

						currentPlayers.add(currentPlayer);
					}
					else { //the player is a goalie
						min = go[0];
						max = go[1];
						range = max - min + 1;
						skillLevel = (int)(Math.random() * range) + min;

						playerNumber = getPlayerNumber();
						currentPlayer = new Player(playerNumber, "G" + String.valueOf(playerNumber));
						currentPlayer.setPosition("Goalie");
						currentPlayer.setLevel(skillLevel);

						currentPlayers.add(currentPlayer);
					}
					j++;
				}

			current.setPlayers(currentPlayers);
			
			}
			i++;
		}
	}

	public void simulation() {
		System.out.println("NHL Simulator(Version 0.1). Author: Cathy Yan");
	
		addPlayersToTeam();
		mainMenu();

	}

	//prints the main menu
	public void mainMenu() {
		for (;;) {
			System.out.println("");
			System.out.println("1 - Simulate NHL Season (Eastern Conference)");
			System.out.println("2 - View Team Skill Level Profile");
			System.out.println("3 - Display End of Regular Season Table");
			System.out.println("Select Option [1,2, or 3] (9 to Quit)");

			userOption();
		}
	}

	public void userOption() {
		Scanner reader = new Scanner(System.in);
		int option = reader.nextInt();
		//reader.close();
		if (option == 1) {
			//getEastSeason();		
			allGamesPlayed();
		}
		else if (option == 2) {
			getTeamSkillLevel();
		}
		else if (option == 3) {
			getScoresAndStats();
		}
		else if (option == 9) {
			quitGame();
		}
		else {
			System.out.println("Invalid option");
			mainMenu();
		}
	}
	public void getEastSeason() {
		System.out.println("running option 1");
	}

	//prompts the player to enter the team name
	public void getTeamSkillLevel() {
		if (allGames.isEmpty()) {
			System.out.println("Must run NHL Eastern Conference Simulation before accessing this option!");
			return;
		}
		Scanner reader = new Scanner(System.in);
		Team currentTeam;
		String currentName = "";
		boolean invalid = true;

		System.out.println("Enter Team Name:");
		
		while(invalid) {
			String option = reader.nextLine();
			
		
				if (option.contentEquals("")) {
					mainMenu();
				}
				int i = 0;
				while(i < teams.size()) {
					//System.out.println("working");
					currentTeam = teams.get(i);
					currentName = currentTeam.getName();

					if (option.equals(currentName)) {
						invalid = false;
						printTeamProfile(currentTeam);
						break;
					}
					i++;
				}
			if(invalid)
				System.out.println(option + " is invalid! Please re-enter or press [Enter]");
				
			
		
		}
		//reader.close();

	}

	public void printTeamProfile(Team team) {
		System.out.println(String.format("%-20s %-20s %-20s %-20s", "No",     "Name",         "Position",         "Skill Level"));
		
		System.out.println(String.format("%-20s %-20s %-20s %-20s", "******", "************", "****************", "****************"));
		
		
		int count = 0;
		for (Player player: team.getPlayers()) {
			
			System.out.println(String.format("%-20s %-20s %-20s %-20s", player.number, player.getName(), player.getPosition(), player.getLevel()));
			count++;
			if(count>=25) {
				break;
			}
		}
	}
	
	//displays total scores and statistics report for Eastern
	//conference; teams in alphabetical order
	public void getScoresAndStats() {
		if (allGames.isEmpty()) {
			System.out.println("Must run NHL Eastern Conference Simulation before accessing this option!");
			return;
		}
		System.out.println("TOTAL SCORES AND STATISTICS REPORT");
		System.out.println("************************************");
		System.out.println(String.format("%-20s %-5s %-5s %-5s %-6s %-5s %-5s %-5s %-6s",
				"Team Name",
				"GP",
				"W",
				"L",
				"OTL",
				"Pts",
				"GF",
				"GA",
				"Diff"));
		
		System.out.println(String.format("%-20s %-5s %-5s %-5s %-6s %-5s %-5s %-5s %-6s",
				"*******************",
				"*****",
				"*****",
				"*****",
				"******",
				"*****",
				"*****",
				"*****",
				"******"));
		Collections.sort(teams);
		for (Team team : teams) {
			int teamPoint = team.getWins() * 2 + team.getOtlosts();
			int teamDiff = team.getGoalsFinished() - team.getGoalsAllowed();
			/*System.out.println(team.getName() + 
					" | GP:" + team.getGP() + 
					" | W:" + team.getWins() + 
					" | L:" + team.getLosts() + 
					" | OTL:" + team.getOtlosts() +
					" | Pts:" + teamPoint +
					" | GF:" + team.getGoalsFinished() +
					" | GA:" + team.getGoalsAllowed() +
					" | Diff:" + teamDiff);
			*/
			System.out.println(String.format("%-20s %-5s %-5s %-5s %-6s %-5s %-5s %-5s %+2d",
					team.getName(),
					team.getGP(),
					team.getWins(),
					team.getLosts(),
					team.getOtlosts(),
					teamPoint,
					team.getGoalsFinished(),
					team.getGoalsAllowed(),
					teamDiff));
		}	
		System.out.println();
		System.out.println("Press Enter to continue...");
		Scanner reader = new Scanner(System.in);
		reader.nextLine();
	}
	
	public void allGamesPlayed() {
		int gamesCount = 0;
		int a = 0;
		int b = 1;
		
		while (gamesCount < 240) {
			Team host = teams.get(a);
			Team visit = teams.get(b);
			
			Game game = new Game(host, visit);
			allGames.add(game);
			//System.out.println(host.getName() + " played " + visit.getName() + " => " + game.getHostTeamPoint() + ":"  + game.getVisitTeamPoint());
			gamesCount++; // counts the number of games played
			
			if (gamesCount % 15 == 0 && gamesCount != 0) {
				//System.out.println("--- --- ---");
				a++;
				b=0;
			} else {
				b++;
			}
			
			if(a == b) b++; // a team cannot be both a host and a visitor
			
		}
		
		for (Team team : teams) {
			team.resetStats();
		}
		
		for (Game game : allGames) {
			Team host = game.getHostTeam();
			Team visit = game.getVisitTeam();
			int hostTeamPoint = game.getHostTeamPoint();
			int visitTeamPoint = game.getVisitTeamPoint();
			boolean overtimeWin = game.isOvertimeWin();

			host.setGP(host.getGP() + 1);
			visit.setGP(visit.getGP() + 1);

			//Host Wins
			if (hostTeamPoint > visitTeamPoint) {
				host.setWins(host.getWins() + 1);
				if (overtimeWin) { //if the host team had an overtime win
					visit.setOtlosts(visit.getOtlosts() + 1);
				} else {
					visit.setLosts(visit.getLosts() + 1);
				}
			} else {//visit team wins
				visit.setWins(visit.getWins() + 1);
				if (overtimeWin) { //if the visit team had an overtime win
					host.setOtlosts(host.getOtlosts() + 1);
				} else {
					host.setLosts(host.getLosts() +1 );
				}
			}
			
			host.setGoalsFinished(host.getGoalsFinished() + hostTeamPoint);
			host.setGoalsAllowed(host.getGoalsAllowed() + visitTeamPoint);
			
			visit.setGoalsFinished(visit.getGoalsFinished() + visitTeamPoint);
			visit.setGoalsAllowed(visit.getGoalsAllowed() + hostTeamPoint);
			
			
		}
		
		Collections.sort(teams, new Comparator<Team>() {
			@Override
			public int compare(Team o1, Team o2) {
				int p1 = o1.getWins() * 2 + o1.getOtlosts();
				int p2 = o2.getWins() * 2 + o2.getOtlosts();
				if (p1 != p2) return p1 - p2;
				int diff1 = o1.getGoalsFinished() - o1.getGoalsAllowed();
				int diff2 = o2.getGoalsFinished() - o2.getGoalsAllowed();
				return diff1 - diff2;
			}
		});

		System.out.println("NHL Regular Season - Eastern Conference - 2018/2019");
		Team teamFirst = teams.get(teams.size()-1);
		Team teamLast = teams.get(0);
		int teamFirstPoints = teamFirst.getWins() * 2 + teamFirst.getOtlosts();;
		int teamLastPoints = teamLast.getWins() * 2 + teamLast.getOtlosts();;
		System.out.println(String.format("%-35s %-15s ","First Team: " + teamFirst.getName(), "Points: " + teamFirstPoints));		
		System.out.println(String.format("%-35s %-15s ","Last  Team: " + teamLast.getName(),  "Points: " + teamLastPoints));
		System.out.println();
		System.out.println("Simulation completed!");
	}
	

	public void quitGame() {
		System.out.println("Terminating simulation...");
		System.exit(0);
	}

	public static void main(String[] args) {
		new NHLSimulator().simulation();
	}

}
