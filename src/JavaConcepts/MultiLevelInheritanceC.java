package JavaConcepts;

class X {
	public void methodX() {
		System.out.println("Class X method");
	}
}

class Y extends X {
	public void methodY() {
		System.out.println("class Y method");
	}

}

class MultiLevelInheritanceC extends Y {
	public void methodZ() {
		System.out.println("class Z method");
	}

	public static void main(String args[]) {
		MultiLevelInheritanceC obj = new MultiLevelInheritanceC();
		obj.methodX(); // calling grand parent class method
		obj.methodY(); // calling parent class method
		obj.methodZ(); // calling local method
	}
}
