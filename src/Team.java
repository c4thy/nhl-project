import java.util.ArrayList;

public class Team {
	String name;
	int[] forwardSkill;
	int[] defenseSkill;
	int[] goalieSkill;
	ArrayList<Player> players = new ArrayList<Player>();
	Integer gp;
	Integer number;

	public Team(String name) {
		this.name = name;
		//willaim
		//this.players = players;

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

	public void setGP(Integer gp) {//william
		this.gp = gp;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {//william
		this.name = name;
	}


}
