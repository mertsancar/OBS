import java.util.List;

public class Professor extends User{

	private int salary;
	private List<Lecture> lectures;
	private int workingYear;
	
	public Professor(String fullName, String iD, String password, Gender gender, String nationality, String email,
			String phoneNumber, int salary, List<Lecture> lectures, int workingYear) {
		super(fullName, iD, password, gender, nationality, email, phoneNumber);
		this.salary = salary;
		this.lectures = lectures;
		this.workingYear = workingYear;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

	public int getWorkingYear() {
		return workingYear;
	}

	public void setWorkingYear(int workingYear) {
		this.workingYear = workingYear;
	}
	
	
	
	
}
