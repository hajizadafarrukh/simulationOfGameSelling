package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void register(User user) {
		if(userCheckService.CheckIfRealPerson(user)==true) {
			System.out.println("Dogrulandi sisteme devam edebilirsiniz");
		}
		else {
			System.out.println("hatali bilgi girdiniz lutfen bilgilerinizi kontrol edin");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() +" isimli kullanicinin hesabi silinmistir");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() +" isimli kullanicinin bilgileri guncellenmistir");
		
	}
	

	
}
