package _14_Exceptions;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		try {
			char x = readAChar();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static char readAChar() throws IOException, SecurityException {
		char ch = (char) System.in.read(); 
		return ch;
	}
}
