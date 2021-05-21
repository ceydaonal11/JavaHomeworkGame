package Project.Business.abstracts;

import GameProject.Entities.concretes.Campaign;
import GameProject.Entities.concretes.Game;
import GameProject.Entities.concretes.Gamer;

public interface SaleService {

	void sale(Game game, Gamer gamer);

	void saleWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
