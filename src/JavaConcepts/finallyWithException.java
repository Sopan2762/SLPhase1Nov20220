package JavaConcepts;

public class finallyWithException {
	public static void main(String args[]) {
		try {
			int number = 5 / 0;
			System.out.println(number);
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("then rest of the code...");
	}
}
