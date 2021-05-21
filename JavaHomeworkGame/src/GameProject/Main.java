package GameProject;

import java.time.LocalDate;

import GameProject.Adapters.MernisServiceAdapter;
import GameProject.Business.concretes.GameManager;
import GameProject.Business.concretes.GamerManager;
import GameProject.Business.concretes.SaleManager;
import GameProject.Entities.concretes.Campaign;
import GameProject.Entities.concretes.Game;
import GameProject.Entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());

		Game game = new Game(1, "Fortnite", 150);
		Gamer gamer = new Gamer(2, "Ceyda", "Önal", LocalDate.of(2000, 04, 07), "11111111110");
		Campaign campaign = new Campaign(3, "Summer Campaign", 50);

		gamerManager.add(gamer);
		// gamerManager.update(gamer);
		// gamerManager.delete(gamer);

		GameManager gameManager = new GameManager();
		gameManager.add(game);
		// gameManager.update(game);
		// gameManager.delete(game);

		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, gamer);

		SaleManager saleManager2 = new SaleManager();
		saleManager2.saleWithCampaign(game, gamer, campaign);

	}

}