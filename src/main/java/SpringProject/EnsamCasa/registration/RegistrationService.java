package SpringProject.EnsamCasa.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.EnsamCasa.appuser.AppUser;
import SpringProject.EnsamCasa.appuser.AppUserRole;
import SpringProject.EnsamCasa.appuser.AppUserService;

@Service
public class RegistrationService {
	
	private final AppUserService appUserService;
	private final EmailValidator emailValidator;
	
	@Autowired
	public RegistrationService(EmailValidator emailValidator, AppUserService appUserService) {
		super();
		this.emailValidator = emailValidator;
		this.appUserService = appUserService;
	}

	public String register(RegistrationRequest request) {
		boolean isValidEmail = emailValidator.test(request.getEmail());
		if(!isValidEmail) {
			throw new IllegalStateException("email not valid");
		}
		return appUserService.signUpUser(new AppUser(
				request.getFirstName(),
				request.getLastName(),
				request.getPassword(),
				request.getEmail(),
				AppUserRole.USER,
				false,
				true
				));
	}
}
