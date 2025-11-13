import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] castVotes = {"A", "B", "C", "A", "A", "B", "C", "B", "B", "A"};

        for (String name : castVotes) {
            votes.put(name, votes.getOrDefault(name, 0) + 1);
        }

        // Print vote counts
        System.out.println("Vote Counts:");
        for (String candidate : votes.keySet()) {
            System.out.println(candidate + ": " + votes.get(candidate));
        }

        // Find winner
        String winner = Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nWinner: " + winner);
    }
}
