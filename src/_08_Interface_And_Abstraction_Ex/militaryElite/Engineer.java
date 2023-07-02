package _08_Interface_And_Abstraction_Ex.militaryElite;

import java.util.Collection;

public interface Engineer extends SpecialisedSoldier{
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
