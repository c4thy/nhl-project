import java.util.ArrayList;

public class Team {
	String name;
	int[] forwardSkill;
	int[] defenseSkill;
	int[] goalieSkill;
	ArrayList<Player> players = new ArrayList<Player>();
	
	Integer gp;
	Integer wins;
	Integer losts;
	Integer otlosts;
	Integer goalsFinished;
	Integer goalsAllowed;

	public Team(String name) {
		this.name = name;
		resetStats();
	}

	public void resetStats() {
		gp = 0;
		wins = 0;
		losts = 0;
		otlosts = 0;
		goalsFinished = 0;
		goalsAllowed = 0;
	}

	public ArrayList<Player> getPlayers(){
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public int[] getFSkillRange() {
		return forwardSkill;
	}

	public void setFSkillRange(int[] forwardSkill) {
		this.forwardSkill = forwardSkill;
	}

	public int[] getDSkillRange() {
		return defenseSkill;
	}

	public void setDSkillRange(int[] defenseSkill) {
		this.defenseSkill = defenseSkill;
	}

	public int[] getGSkillRange() {
		return goalieSkill;
	}

	public void setGSkillRange(int[] goalieSkill) {
		this.goalieSkill = goalieSkill;
	}
	public Integer getGP() {
		return gp;
	}

	public void setGP(Integer gp) {
		this.gp = gp;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLosts() {
		return losts;
	}

	public void setLosts(Integer losts) {
		this.losts = losts;
	}

	public Integer getOtlosts() {
		return otlosts;
	}

	public void setOtlosts(Integer otlosts) {
		this.otlosts = otlosts;
	}

	public Integer getGoalsFinished() {
		return goalsFinished;
	}

	public void setGoalsFinished(Integer goalsFinished) {
		this.goalsFinished = goalsFinished;
	}

	public Integer getGoalsAllowed() {
		return goalsAllowed;
	}

	public void setGoalsAllowed(Integer goalsAllowed) {
		this.goalsAllowed = goalsAllowed;
	}


}
