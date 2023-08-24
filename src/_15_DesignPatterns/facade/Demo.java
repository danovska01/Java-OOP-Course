package _15_DesignPatterns.facade;

public class Demo {
	public static void main(String[] args) {
		IOfis reception = new Reception();
		
		reception.giveMeInvoice();
		System.out.println();
		
		reception.wantToComplain();
		System.out.println();
		
		reception.haveProblemWithWindows();
		System.out.println();

		reception.haveProblemWithLinux();
		System.out.println();

		reception.cleanReception();
		System.out.println();
	}
}
