package _15_DesignPatterns.facade;

//Facade
public class Reception implements IOfis {
	private Accountant accountant = new Accountant(); 
	private ITGuy itGuy = new ITGuy();
	private Boss boss = new Boss();

	private Cleaner cleaner = new Cleaner();

	@Override
	public  void giveMeInvoice() {
		System.out.println("You requested invoice. One will be started now! ");
		String invoice = accountant.giveYouInvoice();
		System.out.println("Invoice was given:  " + invoice);
	}

	@Override
	public void haveProblemWithWindows() {
		System.out.println("Reception: I will transfer you to the guy that will check your problem with the Windows.");
		itGuy.preinstallMiWindows();
	}

	@Override
	public void haveProblemWithLinux() {
		System.out.println("Reception: I will transfer you to the guy that will check your problem with the Linux.");
		itGuy.preinstallLinux();
	}

	@Override
	public void wantToComplain() {
		System.out.println("Reception: I am calling the boss. You can complain than.");
		boss.complainToMe();
	}

	@Override
	public void cleanReception() {
		System.out.println("Reception: I am calling the cleaner now. ");
		cleaner.clean();
	}

}
