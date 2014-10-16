package models.DAO;

import models.entities.Round;

public interface RoundDAO extends GenericDAO<Round, Integer> {
	public Integer getId(Round round);

}
