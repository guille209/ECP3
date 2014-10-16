package models.DAO.mem;

import models.DAO.DAOFactory;
import models.DAO.RoundDAO;
import models.DAO.UserDAO;

public class MemDAOFactory extends DAOFactory {

	public MemDAOFactory() {

	}

	@Override
	public UserDAO getUserDAO() {
		// TODO Auto-generated method stub
		return new MemUserDAO();
	}

	@Override
	public RoundDAO getRoundDAO() {
		// TODO Auto-generated method stub
		return new MemRoundDAO();
	}

}
