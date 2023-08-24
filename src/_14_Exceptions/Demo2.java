package _14_Exceptions;

public class Demo2 {
	public static void main(String[] args) {
		try {
			Person p = new Person("8912132122","Toni", 34);
			p.write();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("We are in the catch block! Message of the exception e is:  " + e.getMessage());
		}
		System.out.println("Ready! - this is after the try-catch");
	}
}
