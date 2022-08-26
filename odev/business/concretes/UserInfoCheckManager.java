package video5.odev.business.concretes;

import video5.odev.business.abstracts.UserInfoCheck;
import video5.odev.entities.concretes.User;

public class UserInfoCheckManager implements UserInfoCheck {
	
	private UserManager userManager;

	@Override
	public boolean checkName(User user) {
		if (user.getFirstName().length()>1) {
			return true;
		} else {
			
			return false;
		}
		
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length()>1) {
			return true;
		} else {
			
			return false;
		}
		
	}

	@Override
	public void checkEMail(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length()>5) {
			return true;
		} else {
			
			return false;
		}
		
	}

}
