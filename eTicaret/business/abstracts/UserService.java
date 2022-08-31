package video5.odevTekrar.eTicaret.business.abstracts;

import video5.odevTekrar.eTicaret.entities.concretes.User;

public interface UserService {
	
	public void add(User user);
	public void delete(User user);
	public void update(User user);
}
