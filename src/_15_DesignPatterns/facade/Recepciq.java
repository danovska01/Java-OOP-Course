package _15_DesignPatterns.facade;

//Facade
public class Recepciq implements IOfis {
	private Accountant accountant = new Accountant(); 
	private ITGuy itGuy = new ITGuy();
	private Shefche shefcheto = new Shefche(); 
	
	/* (non-Javadoc)
	 * @see facade.IOfis#daiMiFaktura()
	 */
	@Override
	public  void daiMiFaktura() {
		System.out.println("Sega shte mu q poiskam!");
		System.out.println("Pyrvo shte preinstaliram windows-a");
		itGuy.preinstalirajMiWindowsa();
		String faktura = accountant.natTiFaktura();
		System.out.println("Toz mi dade  tova " + faktura);
	}
	
	/* (non-Javadoc)
	 * @see facade.IOfis#schupiMiSeWindowsa()
	 */
	@Override
	public void schupiMiSeWindowsa() {
		System.out.println("Sega shte izvikam chovek!");
		itGuy.preinstalirajMiWindowsa();
	}
	
	/* (non-Javadoc)
	 * @see facade.IOfis#iskamDaSeOplacha()
	 */
	@Override
	public void iskamDaSeOplacha() {
		System.out.println("Sega shte izvikam shefa, izchakaite tuk za malko..");
		shefcheto.oplachiMiSeOtNeshto();
		System.out.println("Dovijdane!");
	}
	
}
