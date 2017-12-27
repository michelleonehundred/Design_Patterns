package statisticallyThreadSafe;

public class Singleton {

	// PRIVATE STATIC field
	private static Singleton uniqueSingleton = new Singleton();

	// PRIVATE constructor
	private Singleton() {

	}

	// STATIC method
	public static Singleton getInstance() {
		return uniqueSingleton;
	}

	public String getDescription() {
		return "I'm statistically initialized Singleton";
	}
}
