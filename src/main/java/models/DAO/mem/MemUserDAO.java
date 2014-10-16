package models.DAO.mem;

import models.DAO.UserDAO;
import models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements UserDAO {

	@Override
	public Integer getId(User user) {
		// TODO Auto-generated method stub
		return user.getId();
	}

}
