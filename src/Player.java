
public class Player {
	String name;
	String position;
	Integer number;
	Integer skillLevel;
	
	public Player(Integer number, String name) { //Constructor
		this.name = name;
		this.number = number;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public Integer getLevel() {
		return skillLevel;
	}
	
	public void setLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
