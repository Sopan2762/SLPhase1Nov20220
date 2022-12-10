package JavaConcepts;

public class NetsedTry {
	public static void main(String args[]) {
		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] = new int[5];
				a[0] = 6;
				a[1] = 2;
				a[2] = 5;
				a[3] = 8;
				a[4] = 9;
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("another statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}
}
