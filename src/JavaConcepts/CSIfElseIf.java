package JavaConcepts;

public class CSIfElseIf {

	public static void main(String[] args) {
		int marks = 78;
		if(marks>80) {
		System.out.println("A grade");
		}else if(marks<60) {
			System.out.println("fail");
		}else if(marks>60&&marks<70) {
			System.out.println("C grade");
		}else if(marks>70 &&marks<80) {
			System.out.println("B grade");
		}else if(marks>80 &&marks<90 ) {
			System.out.println("O.S grade");
		}else {
			System.out.println("fail");
		}

	}

}