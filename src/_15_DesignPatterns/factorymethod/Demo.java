package _15_DesignPatterns.factorymethod;

public class Demo {
	public static void main(String[] args) {
		Apteka medeq = new Apteka();
		ILekarstvo lekarstvo = medeq.daiMi(false, 10, 15, false);
		
		lekarstvo.lekuvai();
	}
}
