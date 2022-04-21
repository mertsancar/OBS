public class Lecture {
	
	private String name;
	private String ID;
	private int labHour;
	private int theoreticalHour;
	
	public Lecture(String name, String iD, int labHour, int theoreticalHour) {
		super();
		this.name = name;
		ID = iD;
		this.labHour = labHour;
		this.theoreticalHour = theoreticalHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getLabHour() {
		return labHour;
	}

	public void setLabHour(int labHour) {
		this.labHour = labHour;
	}

	public int getTheoreticalHour() {
		return theoreticalHour;
	}

	public void setTheoreticalHour(int theoreticalHour) {
		this.theoreticalHour = theoreticalHour;
	}
	
	
	
	
	

}
