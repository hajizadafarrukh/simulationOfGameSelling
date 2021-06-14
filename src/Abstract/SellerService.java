package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Seller;


public interface SellerService {
	
	void saleGame(Seller seller,Gamer gamer,Game game);
	void campaignSale(Game game,Gamer gamer,Campaign campaign,Seller seller);
	

}
