package JavaConcepts;

class A123 {
	public void methodA() {
		System.out.println("Base class or parent class : methodA");
	}
}

 class Inheritance_B extends A123 {

	public void methodB() {
		System.out.println("Child class methodB");
	}

	public static void main(String args[]) {
		Inheritance_B obj = new Inheritance_B();
		obj.methodA(); // calling super class method or parent/base class method
		obj.methodB(); // calling local method
	}
}
