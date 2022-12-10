package JavaConcepts;

class finalVariable {
	    final int speedlimit = 90;// final variable
//we cannot change the value of variable if it is declared as final
//we cannot reuse the parent class properties if class is declared as final
//we cannot override (provide own implementation of parent class) is method is declared as final    
	void run() {
		//speedlimit = 400;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		finalVariable obj = new finalVariable();
		obj.run();
	}
}// end of class