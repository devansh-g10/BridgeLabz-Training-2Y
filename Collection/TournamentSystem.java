import java.util.*;

class Team implements Comparable<Team> {
    String name; int points;
    Team(String name, int points) { this.name = name; this.points = points; }
    public int compareTo(Team t) { return Integer.compare(t.points, this.points); }
    public String toString() { return name + " (" + points + ")"; }
}

public class TournamentSystem {
    public static void main(String[] args) {
        Set<String> teams = new HashSet<>();
        Queue<String> matches = new LinkedList<>();
        List<String> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        teams.add("Team A");
        teams.add("Team B");
        teams.add("Team C");

        matches.add("Team A vs Team B");
        matches.add("Team B vs Team C");

        while (!matches.isEmpty()) {
            String match = matches.poll();
            System.out.println("Playing: " + match);
            results.add(match + " → Team A won");
        }

        leaderboard.add(new Team("Team A", 6));
        leaderboard.add(new Team("Team B", 3));
        leaderboard.add(new Team("Team C", 1));

        System.out.println("Leaderboard: " + leaderboard);
    }
}
