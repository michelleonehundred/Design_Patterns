package classic;

public class Main {
	public static void main(String[] args) {

		
		Singleton singleton=Singleton.getInstance();
		
		System.out.println(singleton.getDescription());
		System.out.println(singleton.getAnotherDescription());
		
	}
}
