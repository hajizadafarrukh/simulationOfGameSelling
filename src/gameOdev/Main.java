package gameOdev;

import Adapter.EDevletServiceAdapter;
import Concrete.SellerManager;
import Concrete.UserCheckManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Seller;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer();

		gamer1.setFirstName("Farrukh");
		gamer1.setLastName("Hajizada");
		gamer1.setTcNumber("994994");
		gamer1.setyearOfBirth(1900);
		Gamer gamer2 = new Gamer(2, "deneme@Gmail.com", "Mirza", "Ismayilov", "992", 1990, "gamernumber");
		Seller seller1 = new Seller(1, "seller@gmail.com", "Elnur", "Muellim", "tcnumber", 1900, "sds");
		Game g1 = new Game(1, "Call of Duty", 55);
		Game g2 = new Game(2, "Gta5", 150);

		Campaign yeniyil = new Campaign(1, "Sizlere ozel", 50);
		Campaign kampanya2 = new Campaign(2, "Sok indirim", 80);

		SellerManager smanager = new SellerManager();
		UserManager manager = new UserManager(new EDevletServiceAdapter());

		manager.register(gamer1);
		manager.register(gamer2);

		smanager.saleGame(seller1, gamer2, g2);
		smanager.campaignSale(g2, gamer2, kampanya2, seller1);

	}

}
