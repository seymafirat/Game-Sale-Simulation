import Adapter.MernisServiceAdapter;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Þeyma Nur","Fýrat",1998,"00011122244");
		User user2 = new User(2,"Engin","Demiroð", 1986,"30545612399");
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		System.out.println("User checking: ");
		userManager.add(user1);
		
		Game game1 = new Game(1,"Asphalt 8", 2000);
		Game game2 = new Game(2,"Pubg", 44);
		Game game3 = new Game(3,"GTA V City", 9999);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.update(game2);
		gameManager.delete(game3);
		
		Discount discount1 = new Discount(1,"May Discounts!");
		DiscountManager discountManager = new DiscountManager();
		discountManager.add(discount1);	
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.saleGame(user2, game2, discount1);
		}
	}


