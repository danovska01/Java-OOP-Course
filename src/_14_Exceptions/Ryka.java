package _14_Exceptions;

public class Ryka {
	
	public void udrqiShamari() throws SchupiMiSeNokytchetoException, SchupiMiSeKitkataException {
		System.out.println("Plqs-plqs");
		if (Math.random() > 0.5) {
			System.out.println("eee schypih si nokata zaradi taq svinq");
			throw new SchupiMiSeNokytchetoException();
		}
	}
}
