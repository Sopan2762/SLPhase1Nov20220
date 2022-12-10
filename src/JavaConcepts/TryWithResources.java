package JavaConcepts;

import java.io.FileOutputStream;

public class TryWithResources {
	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("abc.txt")) {
			String msg = "HI I am learning Java";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
			exception.printStackTrace();
			
		}
	}
}
