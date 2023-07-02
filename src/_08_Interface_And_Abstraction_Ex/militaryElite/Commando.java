package _08_Interface_And_Abstraction_Ex.militaryElite;

import java.util.Collection;

public interface Commando extends SpecialisedSoldier{
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
