package _08_Interface_And_Abstraction_Ex.militaryElite;

import java.util.Collection;

public interface LieutenantGeneral extends Private{
    void addPrivate(Private priv);
    Collection<Private> getPrivates();
}
