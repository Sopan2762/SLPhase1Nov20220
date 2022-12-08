package JavaConcepts;

public class Dogclass {
	String breed;
	int age;
	String color,name;

	void barking() {
		System.out.println("barking");
	}

	public Dogclass() {
		System.out.println("default constructor or no argumented constructor of class");
	}

	public Dogclass(String name) {
		System.out.println("Argumented constructor of class, passed name is:" + name);
		this.name = name;
	}
	
	public Dogclass(String breed123,int age,String color) {
		System.out.println("Argumented constructor of class");
		breed=breed123;
		this.age=age;
		this.color=color ;
	}
	
	public void display(){
		System.out.println("breed: "+ breed + " age: "+age +" color: "+color +" name: "+name);
	}

	void sleeping() {
		System.out.println("sleeping");
	}

	void puppy(String name) {
		System.out.println("puppy name is :" + name);
	}
	
	void puppy() {
		System.out.println("puppy age is "+age);
	}

	public static void main(String[] args) {
		Dogclass objDogclass1 = new Dogclass();
		Dogclass objDogclass2 = new Dogclass("tommy");
		Dogclass objDogclass3 = new Dogclass("breed1",6,"white");
		objDogclass1.display();
		objDogclass2.display();
		objDogclass3.display();
		objDogclass3.puppy("henny");
		objDogclass3.puppy();
	}
}
