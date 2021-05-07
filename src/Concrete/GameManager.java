package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game is added: " +game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated: " +game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted: " +game.getGameName());
		
	}

}
