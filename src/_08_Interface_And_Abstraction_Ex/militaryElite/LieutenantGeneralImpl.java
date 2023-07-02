package _08_Interface_And_Abstraction_Ex.militaryElite;

import java.util.*;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    private Set<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>(Comparator.comparingInt(Private::getId).reversed());
    }

    public void addPrivate(Private priv) {
        privates.add(priv);
    }

    public Collection<Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator()).append("Privates:");
        for (Private priv : privates) {
            sb.append(System.lineSeparator()).append("  ").append(priv.toString());
        }
        return sb.toString();
    }
}
