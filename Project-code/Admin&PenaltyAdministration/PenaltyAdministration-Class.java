PenaltyAdministration Class:

java

import java.util.ArrayList;
import java.util.List;

public class PenaltyAdministration {
    private List<String> penalties;

    public PenaltyAdministration() {
        penalties = new ArrayList<>();
    }

    public void addPenalty(String penalty) {
        penalties.add(penalty);
    }

    public void removePenalty(String penalty) {
        penalties.remove(penalty);
    }

    public void displayPenalties() {
        System.out.println("Penalties:");
        for (String penalty : penalties) {
            System.out.println("- " + penalty);
        }
    }
}