package com.AccessModifier1;

class priAccessModifier {

	 private void display() {
		System.out.println("You are using private access specifier");
	}
}

public class AccessModifierPri {

	public static void main(String[] args) {
		// private
		System.out.println("Private Access Specifier");
		priAccessModifier obj = new priAccessModifier();
		// trying to access private method of another class
		//obj.display();
	}
}
