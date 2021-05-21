package GameProject.Business.concretes;

import GameProject.Entities.concretes.Campaign;
import GameProject.Entities.concretes.Game;
import GameProject.Entities.concretes.Gamer;
import Project.Business.abstracts.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("game named " + game.getName() + " sold to gamer " + gamer.getFirstName());

	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {

		System.out.println("game named " + game.getName() + " discount applied " + campaign.getDiscount()
				+ " sold to gamer " + gamer.getFirstName());
	}

}
