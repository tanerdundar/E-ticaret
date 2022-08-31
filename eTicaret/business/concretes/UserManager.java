package video5.odevTekrar.eTicaret.business.concretes;

import video5.odevTekrar.eTicaret.business.abstracts.UserService;
import video5.odevTekrar.eTicaret.dataAccess.abstracts.UserDao;
import video5.odevTekrar.eTicaret.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {

		if (this.chechkLength(user.getFirstName()) > 1) {
			if (this.chechkLength(user.getLastName()) > 1) {
				if (this.chechkLength(user.getPassword()) > 5) {
					this.userDao.add(user);
					return;
				}

				System.out.println("Password must be at least 6 character");
				return;
			}
			System.out.println("Last Name must be at least 2 character");
			return;
		}
		System.out.println("First Name must be at least 2 character");
		return;

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	public int chechkLength(String letters) {

		int number = letters.length();
		return number;
	}

}
