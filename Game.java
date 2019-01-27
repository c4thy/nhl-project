import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
	Team hostTeam;
	Team visitTeam;
	int hostTeamScore;
	int visitTeamScore;
	boolean isOvertimeWin;
	
	public Game(Team hostTeam, Team visitTeam) {
		this.hostTeam = hostTeam;
		this.visitTeam = visitTeam;
		hostTeamScore = 0;
		visitTeamScore = 0;
		isOvertimeWin = false;
		
		//game starts
		battleRegulation();
		if (hostTeamScore == visitTeamScore) {
			battleOvertime();
		}
	}
	
	private int getTeamSkillLevel(Team team) {
		//sum all forwards and defensemen skill level ==> p
		int p = 0;
		for (Player player: team.getPlayers()) {
			if (!player.getPosition().equals("Goalie")) {
				p = p + player.getLevel();
			}
		}
		
		//random select a goalie and output skill level ==> g
		int g = 0;
		Player goalieSelected =  randomSelectGoalie(team);
		g = g + goalieSelected.getLevel();
		
		
		//baseline skill level ==> t
		int t = p + g;
		
		//random decide forward performance: 0: initial 1: well -1: poor
		int forwardPerformance = generateRandomIntFromRange(-1, 1);
		t = t + forwardPerformance * 25;
		
		//random decide defensemen performance: 0: initial 1: well -1: poor
		int defensemenPerformance = generateRandomIntFromRange(-1, 1);
		t = t + defensemenPerformance * 40;
		
		//random decide goalie performance: 0: initial 1: well -1: poor
		int goaliePerformance = generateRandomIntFromRange(-1, 1);
		t = t + goaliePerformance * 60;

		return t;
	}
	
	private void battleRegulation() {
		//host team goals
		int hostTeamSkillLevel = getTeamSkillLevel(hostTeam);
		int hostTeamScoringChances = hostTeamSkillLevel / 50;
		int hostTeamScoringOdds = hostTeamSkillLevel % 50;
		hostTeamScore = 0;
		for (int i = 0 ; i < hostTeamScoringChances; i ++) {
			//random select 0, 1 or 2 goals
			int goals = generateRandomIntFromRange(0, 2);
			hostTeamScore = hostTeamScore + goals;
		}
		if (hostTeamScoringOdds > 0) {
			//random select 0 or 1
			int goals = generateRandomIntFromRange(0, 1);
			hostTeamScore = hostTeamScore + goals;
		}
		
		//visit team goals
		int visitTeamSkillLevel = getTeamSkillLevel(visitTeam);
		int visitTeamScoringChances = visitTeamSkillLevel / 50;
		int visitTeamScoringOdds = visitTeamSkillLevel % 50;
		visitTeamScore = 0;
		for (int i = 0 ; i < visitTeamScoringChances; i ++) {
			//random select 0, 1 or 2 goals
			int goals = generateRandomIntFromRange(0, 2);
			visitTeamScore = visitTeamScore + goals;
		}
		if (visitTeamScoringOdds > 0) {
			//random select 0 or 1
			int goals = generateRandomIntFromRange(0, 1);
			visitTeamScore = visitTeamScore + goals;
		}
	}
	
	private void battleOvertime() {
		//host team in overtime
		List<Player> hostTeamNonGoalies = new ArrayList<>();
		for (Player player : hostTeam.getPlayers()) {
			if (!player.getPosition().equals("Goalie")) {
				hostTeamNonGoalies.add(player);
			}
		}
		//random select players: 3 forwards/defensement + 1 goalie
		int hostTeamOvertimeSkillLevel = 0;
		for (int i = 0; i < 3; i ++) {
			Player player = randomSelectPlayer(hostTeamNonGoalies);
			hostTeamNonGoalies.remove(player);
			hostTeamOvertimeSkillLevel = hostTeamOvertimeSkillLevel + player.getLevel();
		}
		hostTeamOvertimeSkillLevel = hostTeamOvertimeSkillLevel + randomSelectGoalie(hostTeam).getLevel();
		
		//visit team in overtime
		List<Player> visitTeamNonGoalies = new ArrayList<>();
		for (Player player : visitTeam.getPlayers()) {
			if (!player.getPosition().equals("Goalie")) {
				visitTeamNonGoalies.add(player);
			}
		}
		//random select players: 3 forwards/defensement + 1 goalie
		int visitTeamOvertimeSkillLevel = 0;
		for (int i = 0; i < 3; i ++) {
			Player player = randomSelectPlayer(visitTeamNonGoalies);
			visitTeamNonGoalies.remove(player);
			visitTeamOvertimeSkillLevel = visitTeamOvertimeSkillLevel + player.getLevel();
		}
		visitTeamOvertimeSkillLevel = visitTeamOvertimeSkillLevel + randomSelectGoalie(visitTeam).getLevel();
		
		//battle
		if (hostTeamOvertimeSkillLevel > visitTeamOvertimeSkillLevel) {
			hostTeamScore ++;
		} else if (hostTeamOvertimeSkillLevel < visitTeamOvertimeSkillLevel) {
			visitTeamScore ++;
		} else {
			//random select first overtime goal: 0: host team scored 1: visit team scored
			int overtimeScored = generateRandomIntFromRange(0, 1);
			if (overtimeScored == 0) {
				hostTeamScore ++;
			} else {
				visitTeamScore ++;
			}
		}
		
		isOvertimeWin = true;
		
	}
	
	public int getHostTeamPoint() {
		if (hostTeamScore > visitTeamScore) {
			//host team won
			return 2;
		} else if (isOvertimeWin) {
			//host team lost in overtime
			return 1;
		} else {
			//host team lost in regulation
			return 0;
		}
	}
	
	public int getVisitTeamPoint() {
		if (visitTeamScore > hostTeamScore) {
			//host team won
			return 2;
		} else if (isOvertimeWin) {
			//host team lost in overtime
			return 1;
		} else {
			//host team lost in regulation
			return 0;
		}
	}
	
	public Team getHostTeam() {
		return hostTeam;
	}
	
	public Team getVisitTeam() {
		return visitTeam;
	}
	
	public boolean isOvertimeWin() {
		return isOvertimeWin;
	}
	
	private int generateRandomIntFromRange(int min, int max) {
	    Random r = new Random(System.currentTimeMillis());
	    return r.nextInt((max - min) + 1) + min;
	}
	
	private Player randomSelectGoalie(Team team) {
		List<Player> allGoalies = new ArrayList<>();
		for (Player player: team.getPlayers()) {
			if (player.getPosition().equals("Goalie")) {
				allGoalies.add(player);
			}
		}
		return randomSelectPlayer(allGoalies);
	}
	
	private Player randomSelectPlayer(List<Player> players) {
		return players.get(generateRandomIntFromRange(0, players.size() - 1));
	}
	
}
