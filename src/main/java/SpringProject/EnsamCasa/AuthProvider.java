package SpringProject.EnsamCasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import SpringProject.EnsamCasa.appuser.AppUserRepository;
import SpringProject.EnsamCasa.appuser.AppUserService;

public class AuthProvider implements AuthenticationProvider{
	
		@Autowired private AppUserService appUserService; 
		@Autowired private PasswordEncoder passwordEncoder; 
		@Autowired private AppUserRepository appUserRepository; 
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
	
	
	
	
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(daoAuthenticationProvider());
//	}
//	
//	@Bean
//	public DaoAuthenticationProvider daoAuthenticationProvider() {
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setPasswordEncoder(bCryptPasswordEncoder);
//		provider.setUserDetailsService(appUserService);
//		return provider;
//	}
}
