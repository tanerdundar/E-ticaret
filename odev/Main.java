package video5.odev;

import video5.odev.business.abstracts.UserService;
import video5.odev.business.concretes.UserInfoCheckManager;
import video5.odev.business.concretes.UserManager;
import video5.odev.entities.concretes.User;

public class Main {
	
	public static void main  (String[] args) {
		
//		
//		String pattern = "[abc]adef";
//		System.out.println("aadef".matches(pattern));
//		
//		String pattern2 = "^[A-z0-9]+@+^[A-z0-9]";
//		System.out.println("Zzzzzzzzzz8@z8".matches(pattern2));
		
		User taner = new User();
		taner.setFirstName("Taner");
		taner.setLastName("adg");
		taner.setPassword("2354353");
		UserService um = new UserManager(new UserInfoCheckManager());
		um.add(taner);

	}

}
