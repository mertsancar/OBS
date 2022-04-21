import java.util.List;

public class Department {
	
	private String name;
	private String ID;
	private String faculty;
	private boolean isBachelor;
	private String headOfDepartment;
	private double examScore;
	private String secretaryOfDepartment;
	private int studentCount;
	private List<String> erasmusCountry;
	
	public Department(String name, String iD, String faculty, boolean isBachelor, String headOfDepartment,
			double examScore, String secretaryOfDepartment, int studentCount, List<String> erasmusCountry) {
		super();
		this.name = name;
		ID = iD;
		this.faculty = faculty;
		this.isBachelor = isBachelor;
		this.headOfDepartment = headOfDepartment;
		this.examScore = examScore;
		this.secretaryOfDepartment = secretaryOfDepartment;
		this.studentCount = studentCount;
		this.erasmusCountry = erasmusCountry;
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

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public boolean isBachelor() {
		return isBachelor;
	}

	public void setBachelor(boolean isBachelor) {
		this.isBachelor = isBachelor;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	public double getExamScore() {
		return examScore;
	}

	public void setExamScore(double examScore) {
		this.examScore = examScore;
	}

	public String getSecretaryOfDepartment() {
		return secretaryOfDepartment;
	}

	public void setSecretaryOfDepartment(String secretaryOfDepartment) {
		this.secretaryOfDepartment = secretaryOfDepartment;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public List<String> getErasmusCountry() {
		return erasmusCountry;
	}

	public void setErasmusCountry(List<String> erasmusCountry) {
		this.erasmusCountry = erasmusCountry;
	}


}
