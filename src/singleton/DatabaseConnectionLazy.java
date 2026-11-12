package singleton;

public class DatabaseConnectionLazy {
	
	//2. način impelemtnacije - Lazy loading
	private static DatabaseConnectionLazy instance;
	
	private DatabaseConnectionLazy() {
		
	}

	public static DatabaseConnectionLazy getInstance() {
		//konkurentno programiranje, paralelno koriscenje aplikacije
		if(instance==null) {
			//sinhronizacija - dodatna provera da ne bismo napravili 2 objekta
			synchronized(DatabaseConnectionLazy.class) {
				if(instance==null)
					instance = new DatabaseConnectionLazy();
			}
		}
		return instance;
	}
	
	

}
