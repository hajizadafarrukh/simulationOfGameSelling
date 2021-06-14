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
		System.out.println("Bu bir simulyasyon dogrulamadir");
		return true;
}
}