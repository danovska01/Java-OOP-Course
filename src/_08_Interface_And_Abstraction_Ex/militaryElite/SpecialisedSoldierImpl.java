package _08_Interface_And_Abstraction_Ex.militaryElite;

public class SpecialisedSoldierImpl extends SoldierImpl implements SpecialisedSoldier{
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, Corps corps) {
        super(id, firstName, lastName);
        this.corps = corps;
    }

    public String getCorps() {
        return corps.toString();
    }
}
