package video5.odevTekrar.eTicaret;

import video5.odevTekrar.eTicaret.business.abstracts.UserService;
import video5.odevTekrar.eTicaret.business.concretes.UserManager;
import video5.odevTekrar.eTicaret.dataAccess.concretes.*;
import video5.odevTekrar.eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService deneme = new UserManager(new TrialUserDao());
		UserService newDeneme = new UserManager(new ABCUserDao());
		
		User taner = new User(5, "saa", "ass", "asdshjer", "qwer");

		User newTaner = new User(5, "at", "ass", "asdshjer", "qwer");
		
		deneme.add(taner);
		newDeneme.add(newTaner);

	}

}
