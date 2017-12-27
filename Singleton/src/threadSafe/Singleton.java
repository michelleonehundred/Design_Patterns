package threadSafe;

public class Singleton {

	private static Singleton uniqueSingleton;
	
	private Singleton() {
		
	}
	
	//synchronized keyword for ThreadSafety
	public static synchronized Singleton getInstance() {
		if(uniqueSingleton==null) {
			//lazy instantiation
			uniqueSingleton=new Singleton();
		}
		return uniqueSingleton;
	}
	
	public String getDecription() {
		return "I'm a thread safe Description";
	}
	
}
