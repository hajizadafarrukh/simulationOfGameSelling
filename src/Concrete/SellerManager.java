package Concrete;

import Abstract.SellerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Seller;



public class SellerManager implements SellerService{

	@Override
	public void saleGame(Seller seller, Gamer gamer, Game game) {
		System.out.println(seller.getFirstName()+" saticisindan " +
				 game.getGameName()+" isimli oyunu " + gamer.getFirstName() +" "
				 +gamer.getLastName() +" isimli kullanici " + game.getGamePrice() + " TL-ye aldi" );
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign,Seller seller) {
		double discountedPrice = game.getGamePrice()- (game.getGamePrice() * campaign.getDiscount()/100);
		double previousPrice = game.getGamePrice();
		
		System.out.println(gamer.getFirstName() +" isimli kullanici eski fiyati " + 
		previousPrice + " TL olan oyunu + "+ campaign.getCampName() + " adli kampanyadan yararlanarak yuzde "+
				campaign.getDiscount() + " indirimle " + discountedPrice + " tl-ye " +
		seller.getFirstName() +" isimli saticidan aldi");
		
		
		
	}

}




