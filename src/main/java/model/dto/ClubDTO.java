package model.dto;

public class ClubDTO {
	private long clubId;
	private String cname;
	private String goal;
	private String info;
	private int max_member;
	private long leader;//tnwjd
	
	public ClubDTO() {
		super();
	}
	
	public ClubDTO(long clubId, String cname, String goal, String info, int max_member, long leader) {
		this.clubId = clubId;
		this.cname = cname;
		this.goal = goal;
		this.info = info;
		this.max_member = max_member;
		this.leader = leader;
	}
	
	public ClubDTO(String cname, String goal, String info, int max_member, long leader) {
		this.cname = cname;
		this.goal = goal;
		this.info = info;
		this.max_member = max_member;
		this.leader = leader;	}

	public ClubDTO(long clubId, String cname, String goal, String info) {
		this.clubId = clubId;
		this.cname = cname;
		this.goal = goal;
		this.info = info;

	}

	public long getClubId() {
		return clubId;
	}

	public void setClubId(long clubId) {
		this.clubId = clubId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getMax_member() {
		return max_member;
	}

	public void setMax_member(int max_member) {
		this.max_member = max_member;
	}

	public long getLeader() {
		return leader;
	}

	public void setLeader(long leader) {
		this.leader = leader;
	}

	
}
