package video5.odevTekrar.eTicaret.dataAccess.abstracts;

import video5.odevTekrar.eTicaret.entities.concretes.User;

public interface UserDao {
	
	public void add(User user);
	public void delete(User user);
	public void update(User user);

}
