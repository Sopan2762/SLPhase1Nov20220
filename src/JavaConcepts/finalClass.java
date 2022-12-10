package JavaConcepts;

//if a class is declared as final we cannot extend or inherit it and we cannot perform overloading and overriding.
// final class Bike3121 {
class Bike3121 {
	final void run() {
		System.out.println("bike is running");
	}
}

class finalClass extends Bike3121 {

	/*
	 * void run() { System.out.println("car is running"); }
	 */
	public static void main(String args[]) {
		finalClass honda = new finalClass();
		honda.run();
	}
}
