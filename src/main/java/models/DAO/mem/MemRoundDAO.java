package models.DAO.mem;

import models.DAO.RoundDAO;
import models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements
		RoundDAO {

	@Override
	public Integer getId(Round round) {
		// TODO Auto-generated method stub
		return round.getId();
	}

}
