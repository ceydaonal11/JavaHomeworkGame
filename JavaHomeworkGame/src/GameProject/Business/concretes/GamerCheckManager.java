package GameProject.Business.concretes;

import GameProject.Entities.concretes.Gamer;
import Project.Business.abstracts.GamerCheckService;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {

		return true;
	}

}
