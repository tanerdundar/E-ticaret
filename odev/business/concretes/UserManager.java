package video5.odev.business.concretes;

import video5.odev.business.abstracts.UserService;
import video5.odev.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserInfoCheckManager userInfoCheckManager;

	public UserManager(UserInfoCheckManager userInfoCheckManager) {
		super();
		this.userInfoCheckManager = userInfoCheckManager;
	}



	@Override
	public void add(User user) {
		
		if (this.userInfoCheckManager.checkName(user)) {
			if  (this.userInfoCheckManager.checkLastName(user)) {
				if (this.userInfoCheckManager.checkPassword(user)) {
					System.out.println(user.getFirstName() + " named user added to system.");
				}  else { 
					System.out.println("Password is too short");
				}
				
			} else {
				System.out.println("User lastname is too short.");
			}
		} else {
			System.out.println("User name is too short.");
		}
		
		
	}

}
