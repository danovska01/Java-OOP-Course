package _14_Exceptions;

import exceptions.PersonException;

public class Person {
	private final String egn;
	private String name;
	private int age;
	private Ryka ryka;

	public Person(String egn, String name, int age) throws PersonException {
		this.egn = egn;
		setName(name);
		setAge(age);
		this.ryka = new Ryka();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws PersonException {
		if ((name != null) && (name.trim().length() > 0))
			this.name = name;
		else {
			throw new PersonException("Kvo e tui prazno ime, ve manaf ?!");
		}
	}

	public void napiiSaIBuistvai() throws PersonException {
		System.out.println("Napivam se i buistvam");
		System.out.println("Sega shte vi naplqskam vsichkite");
		try {
			this.ryka.udrqiShamari();
		} catch (SchupiMiSeNokytchetoException e) {
			// rethrow
			throw new PersonException("Sistemata vremenno ne raboti, molq opitaite po-kysno", e);
		} catch (SchupiMiSeKitkataException e) {
			// rethrow
			throw new PersonException("Sistemata vremenno ne raboti, molq opitaite po-kysno", e);
		}
		System.out.println("Mamito vi");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws PersonException {
		if (age > 0)
			this.age = age;
		else {
			throw new PersonException("Kvo sa tiq godini, ve manaf ?!");
		}
	}

	public String getEgn() {
		return egn;
	}

}
