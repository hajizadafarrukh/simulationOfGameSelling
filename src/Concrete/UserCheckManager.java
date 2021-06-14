package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

	User user;

	public UserCheckManager(User user) {

		this.user = user;
	}

	@Override
	public boolean CheckIfRealPerson(User user) {
		if (user.getFirstName() == "Farrukh" && user.getLastName() == "Hajizada"
				&& user.getyearOfBirth() == 1900 && user.getTcNumber() == "994994")

		{
			return true;
		} else {
			return false;
		}
	}
}
