package _08_Interface_And_Abstraction_Ex.militaryElite;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    public String getCodeName() {
        return codeName;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Code Name: " + codeName + " State: " + state.toString().toLowerCase();
    }
}
