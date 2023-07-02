package _08_Interface_And_Abstraction_Ex.militaryElite;

import java.util.*;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando{
    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, Corps corps) {
        super(id, firstName, lastName, corps);
        this.missions = new LinkedHashSet<>();
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    public Collection<Mission> getMissions() {
        return missions;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator()).append("Corps: ").append(getCorps());
        sb.append(System.lineSeparator()).append("Missions:");
        for (Mission mission : missions) {
            sb.append(System.lineSeparator()).append("  ").append(mission.toString());
        }
        return sb.toString();
    }
}
