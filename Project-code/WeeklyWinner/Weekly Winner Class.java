Weekly Winner Class:

import java.util.ArrayList;
import java.util.List;

public class WeeklyWinner {
    private List<String> contestants;

    public WeeklyWinner() {
        this.contestants = new ArrayList<>();
    }

    public void participateInWeeklyWinner(String userId) {
        System.out.println("User " + userId + " chooses to participate in Weekly Winner.");
        boolean hasPoints = checkPoints(userId);
        boolean hasFriends = checkFriends(userId);
        
        if (hasPoints && hasFriends) {
            addContestant(userId);
            int ranking = getRanking(userId);
            notifyUser(userId, ranking);
        } else if (!hasPoints) {
            System.out.println("User " + userId + " needs to collect points to participate.");
        } else if (!hasFriends) {
            System.out.println("User " + userId + " needs to have friends to participate.");
        }
    }

    private boolean checkPoints(String userId) {
        // Perform the necessary checks to see if the user has collected points
        return true; // Placeholder, return actual result
    }

    private boolean checkFriends(String userId) {
        // Perform the necessary checks to see if the user has friends
        return true; // Placeholder, return actual result
    }

    private void addContestant(String userId) {
        contestants.add(userId);
        System.out.println("User " + userId + " added to the list of contestants.");
    }

    private int getRanking(String userId) {
        // Perform the necessary calculations to determine the user's ranking
        return 1; // Placeholder, return actual ranking
    }

    private void notifyUser(String userId, int ranking) {
        System.out.println("User " + userId + ", you are ranked " + ranking + " in the Weekly Winner contest.");
        // Send appropriate notification to the user
    }

    // Additional methods and implementation details

    // ...
}