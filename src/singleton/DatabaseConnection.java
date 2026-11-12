package singleton;

public class DatabaseConnection {
	
	//1. način - eager loading
	private static DatabaseConnection instance = new DatabaseConnection();
	
	private /*public*/ DatabaseConnection() {
		
	}

	//logika povezivanja na neku BP
	

	public static DatabaseConnection getInstance() {
		return instance;
	}
	

}
