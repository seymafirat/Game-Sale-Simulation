package Concrete;

import Abstract.SalesService;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class SaleManager implements SalesService{

	@Override
	public void saleGame(User user, Game game) {
		System.out.println(user.getFirstName() + "is sold: " +game.getGameName());
		
	}
	
	public void saleGame(User user, Game game, Discount discount) {
		System.out.println(user.getFirstName() + " is sold " +game.getGameName() + ": " + discount.getDiscountName());
	}

}
