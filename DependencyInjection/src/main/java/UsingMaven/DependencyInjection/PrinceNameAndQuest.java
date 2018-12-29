package UsingMaven.DependencyInjection;

public class PrinceNameAndQuest implements Missions{

	private String pname;
	private Quest missionname;
	
	
	
	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public Quest getMissionname() {
		return missionname;
	}



	public void setMissionname(Quest missionname) {
		this.missionname = missionname;
	}



	public void QuestDragon() {
		System.out.println("Prince name: "+pname +" "+"has done"+missionname);
		
	}
	
	
}
