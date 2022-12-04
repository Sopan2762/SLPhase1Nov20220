package JavaConcepts;

import javax.swing.plaf.multi.MultiButtonUI;

public class ControlStatementifElse {
	int a =43;
	
	int Mul(int i,int j) {
		return i*j;
	}

	public static void main(String[] args) {

		ControlStatementifElse obj = new ControlStatementifElse();	
		int result = obj.Mul(6, 3);
		if(result>14) {
			System.out.println("output:"+result+"is greathen than 12 , condition satisfied");
		}else {
			System.out.println("condition is not satisfied");
		}
	
	}

}