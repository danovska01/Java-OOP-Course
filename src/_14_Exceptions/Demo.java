package _14_Exceptions;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		try {
			char x = readAChar();
			System.out.println(x);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static char readAChar() throws IOException, SecurityException {
		char ch = (char) System.in.read(); 
		return ch;
	}
}
