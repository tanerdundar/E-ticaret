package video5.odevTekrar.eTicaret.dataAccess.concretes;

import video5.odevTekrar.eTicaret.dataAccess.abstracts.UserDao;
import video5.odevTekrar.eTicaret.entities.concretes.User;

public class TrialUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Added with Trial : " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

}
