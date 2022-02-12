package SpringProject.EnsamCasa.registration;

import SpringProject.EnsamCasa.appuser.AppUserRole;
import lombok.*;

@EqualsAndHashCode
@ToString
public class RegistrationRequest {
	private final String firstName;
	private final String lastName;
	private final String password;
	private final String email;
	private final String CIN;
	private final AppUserRole appUserRole;
	
	public RegistrationRequest(String firstName, String lastName, String password, String email, AppUserRole appUserRole, String CIN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.CIN = CIN; 
		this.appUserRole = appUserRole;
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
	
	public String getCIN() {
		return CIN;
	}

	public AppUserRole getAppUserRole() {
		return appUserRole;
	}
	
}
