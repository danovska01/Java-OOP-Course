package _08_Interface_And_Abstraction_Ex.militaryElite;

import java.util.*;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer{
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, Corps corps) {
        super(id, firstName, lastName, corps);
        this.repairs = new LinkedHashSet<>();
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    public Collection<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator()).append("Corps: ").append(getCorps());
        sb.append(System.lineSeparator()).append("Repairs:");
        for (Repair repair : repairs) {
            sb.append(System.lineSeparator()).append("  ").append(repair.toString());
        }
        return sb.toString();
    }
}
