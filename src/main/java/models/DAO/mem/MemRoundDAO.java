package models.DAO.mem;

import models.DAO.RoundDAO;
import models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements
		RoundDAO {

	@Override
	protected Integer getId(Round round) {
		return round.getId();
	}

}
