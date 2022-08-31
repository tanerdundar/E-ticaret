package video5.odevTekrar.eTicaret.dataAccess.concretes;

import video5.odevTekrar.eTicaret.dataAccess.abstracts.UserDao;
import video5.odevTekrar.eTicaret.entities.concretes.User;

public class ABCUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Added with ABC : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted with ABC : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated with ABC : " + user.getFirstName());
		
	}
	
	

}
