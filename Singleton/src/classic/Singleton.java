package classic;

public class Singleton {

	//field
	private static Singleton uniqueSingleton;
	
	//constructor
	private Singleton() {
		
	}
	
	//method
	public static Singleton getInstance()
	{
		if(uniqueSingleton==null)
		{
			uniqueSingleton=new Singleton();
			//lazy instantiation
			
		}
		return uniqueSingleton;
	}
	
	public String getDescription() {
		return "I'm a classic Description";
	}
	
	public String getAnotherDescription() {
		return "I'm another Description";
	}
	
	
}
