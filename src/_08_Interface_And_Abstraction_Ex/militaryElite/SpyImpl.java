package _08_Interface_And_Abstraction_Ex.militaryElite;

public class SpyImpl extends SoldierImpl implements Spy{
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Code Number: " + codeNumber;
    }
}
