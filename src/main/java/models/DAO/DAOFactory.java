package models.DAO;

public abstract class DAOFactory {

	protected static DAOFactory factory;

	public static DAOFactory getInstance() {
		assert factory != null : "Instancia no inyectada";
		return factory;
	}

	public static void setDAOFactory(DAOFactory daoFactory) {
		factory = daoFactory;

	}

	public abstract UserDAO getUserDAO();

	public abstract RoundDAO getRoundDAO();

}
