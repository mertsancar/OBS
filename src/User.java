import java.util.ArrayList;
import java.util.List;

public class User {
	
	public String fullName;
	public String ID;
	public String password;
	public Gender gender;
	public String nationality;
	public String dateOfBirth;
	public String email;
	public String phoneNumber;
	public List<Message> inbox;
	
	public User(String fullName, String iD, String password, Gender gender, String nationality, String email,
			String phoneNumber) {
		super();
		this.fullName = fullName;
		ID = iD;
		this.password = password;
		this.gender = gender;
		this.nationality = nationality;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.inbox = new ArrayList<Message>();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
