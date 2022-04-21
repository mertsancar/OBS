//import java.util.Dictionary;
import java.util.List;

public class Student extends User {
	
	private float GPA;
	private Department department;
	private int startingYear;
	private int graduateYear;
	private List<Lecture> lectures;
	//private Dictionary<Lecture, LetterGrades> grades = new Dictionary<Lecture, LetterGrades>();
	
	
	public Student(String fullName, String iD, String password, Gender gender, String nationality, String email,
			String phoneNumber, float gPA, Department department, int startingYear, int graduateYear,
			List<Lecture> lectures) {
		super(fullName, iD, password, gender, nationality, email, phoneNumber);
		GPA = gPA;
		this.department = department;
		this.startingYear = startingYear;
		this.graduateYear = graduateYear;
		this.lectures = lectures;
	}


	public float getGPA() {
		return GPA;
	}


	public void setGPA(float gPA) {
		GPA = gPA;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public int getStartingYear() {
		return startingYear;
	}


	public void setStartingYear(int startingYear) {
		this.startingYear = startingYear;
	}


	public int getGraduateYear() {
		return graduateYear;
	}


	public void setGraduateYear(int graduateYear) {
		this.graduateYear = graduateYear;
	}


	public List<Lecture> getLectures() {
		return lectures;
	}


	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}
	
	
	
	

}
