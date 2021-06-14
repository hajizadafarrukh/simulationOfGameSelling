package Adapter;

import Abstract.UserCheckService;
import Entities.User;

public class EDevletServiceAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		System.out.println("Bu bir simulyasyon dogrulamadir");
		return true;
	}

}
