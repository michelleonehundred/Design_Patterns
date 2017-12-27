package threadSafe;

public class Main {
	public static void main(String[] args) {

		Singleton sing = Singleton.getInstance();

		System.out.println(sing.getDecription());

	}

}
