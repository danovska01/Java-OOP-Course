package _15_DesignPatterns.facade;

public class Demo {
	public static void main(String[] args) {
		IOfis repeciq = new Recepciq();
		
		repeciq.daiMiFaktura();
		System.out.println();
		
		repeciq.iskamDaSeOplacha();
		
		System.out.println();
		
		repeciq.schupiMiSeWindowsa();
	}
}
