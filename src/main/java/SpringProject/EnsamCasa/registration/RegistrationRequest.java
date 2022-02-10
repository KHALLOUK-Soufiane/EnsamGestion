package SpringProject.EnsamCasa.registration;

import lombok.*;

@EqualsAndHashCode
@ToString
public class RegistrationRequest {
	private final String firstName;
	private final String lastName;
	private final String password;
	private final String email;
	
	public RegistrationRequest(String firstName, String lastName, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}	
	
	
}
