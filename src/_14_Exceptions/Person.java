package _14_Exceptions;


import _14_Exceptions.exceptions.PersonException;

public class Person {
	private final String egn;
	private String name;
	private int age;
	private Hand hand;

	public Person(String egn, String name, int age) throws PersonException {
		this.egn = egn;
		setName(name);
		setAge(age);
		this.hand = new Hand();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws PersonException {
		if ((name != null) && (name.trim().length() > 0))
			this.name = name;
		else {
			throw new PersonException("Name is empty!");
		}
	}

	public void write() throws PersonException {

//		System.out.println("We will get inside the block of Person Exception! just now");
		try {
			System.out.println("In the try block: ...");
			this.hand.write();
		} catch (handBecomesTired e) {
			// rethrow
			throw new PersonException("Rethrow exception! ", e);
		} catch (HandBroken e) {
			// rethrow
			throw new PersonException("Throw New exception. ", e);
		}
//		System.out.println("Out of the block of Person Exception");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws PersonException {
		if (age > 0)
			this.age = age;
		else {
			throw new PersonException("Age is not valid!");
		}
	}

	public String getEgn() {
		return egn;
	}

}
