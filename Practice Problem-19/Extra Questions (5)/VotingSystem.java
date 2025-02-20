import java.util.*;

public class VotingSystem {
    HashMap<String, Integer> votes = new HashMap<>();

    public void vote(String candidate) {
        if (votes.containsKey(candidate))
            votes.put(candidate, votes.get(candidate) + 1);
        else
            votes.put(candidate, 1);
    }

    public void displayResults() {
        ArrayList<String> sortedCandidates = new ArrayList<>(votes.keySet());
        Collections.sort(sortedCandidates);
        for (String candidate : sortedCandidates) {
            System.out.println(candidate + ": " + votes.get(candidate));
        }
    }
}
