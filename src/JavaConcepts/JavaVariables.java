package JavaConcepts;

public class JavaVariables {
	
    int i =17;//this is called an instance variable.Declared/initialized inside a class out side a method.
               //out side a method.
    static String str1 = "learning java"; //variable declared with static keyword is called a static variable.
    int[] arr = { 2,5,7,9};
    char c = 's';
    float f1 =5.23f;
    double db = 854.4d;
    boolean flag =false;
    
    int add(int a, int b) {  //local variable : variable declared inside a method is called local variables.
        return a+b;
    }
    
    public void display() {
        System.out.println("hi how are you ...display is getting executed");
   
    }
 
    public static void main(String [] args) {
	    JavaVariables objJa = new JavaVariables();
	  
	    System.out.println(objJa.i);
	    System.out.println(objJa.add(4, 8));
	    System.out.println(str1);
  }
      
}
