package Abstract;

import Entities.User;

public interface UserService {
	void register(User user);
	void delete(User user);
	void update(User user);
	

}
