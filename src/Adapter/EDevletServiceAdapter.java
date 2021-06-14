package Adapter;

import Abstract.UserCheckService;
import Entities.User;

public class EDevletServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		if (user.getFirstName() == "Farrukh" && user.getLastName() == "Hajizada" && user.getyearOfBirth() == 1900
				&& user.getTcNumber() == "994994")

		{
			return true;
		} else {
			return false;
		}
	}
}
