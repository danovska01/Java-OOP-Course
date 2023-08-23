package _14_Exceptions;

public class Demo2 {
	public static void main(String[] args) {
		try {
			Person p = new Person("8912132122","Toni Globusa", 34);
			p.napiiSaIBuistvai();
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("E ne stana shtoto " + e.getMessage());
		}
		System.out.println("Gotovo");
	}
}
