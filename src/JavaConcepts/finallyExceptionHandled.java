package JavaConcepts;

public class finallyExceptionHandled {

	finallyExceptionHandled() {
		System.out.println("inside construcor");
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		try {
			finallyExceptionHandled obj = new finallyExceptionHandled();
			int AddResult = obj.add(6, 9);
			System.out.println("AddResult:" + AddResult);
			int number = 25 / 0;
			System.out.println(number);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
