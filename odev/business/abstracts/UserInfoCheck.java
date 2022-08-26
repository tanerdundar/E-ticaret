package video5.odev.business.abstracts;

import video5.odev.entities.concretes.User;

public interface UserInfoCheck {
	
	public boolean checkName(User user);
	public boolean checkLastName(User user);
	public void checkEMail(User user);
	public boolean checkPassword(User user);

}
