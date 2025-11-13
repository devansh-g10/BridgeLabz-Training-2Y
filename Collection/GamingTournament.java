import java.util.*;

class Player {
    String name;
    public Player(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Player) {
            return name.equals(((Player) obj).name);
        }
        return false;
    }
}

class Match {
    Player p1, p2;
    public Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public String toString() {
        return p1 + " vs " + p2;
    }
}


class Result {
    Player winner;
    Player loser;
    int points;

    public Result(Player winner, Player loser, int points) {
        this.winner = winner;
        this.loser = loser;
        this.points = points;
    }

    public String toString() {
        return "Winner: " + winner + ", Loser: " + loser + ", Points: " + points;
    }
}

class Score implements Comparable<Score> {
    String player;
    int points;

    public Score(String player, int points) {
        this.player = player;
        this.points = points;
    }

    public int compareTo(Score s) {
        return s.points - this.points; // descending order
    }

    public String toString() {
        return player + " - " + points + " pts";
    }
}

public class GamingTournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Rohit"));
        players.add(new Player("Aman"));
        players.add(new Player("Ravi"));
        players.add(new Player("Rohit")); // duplicate ignored

        System.out.println("Registered Players: " + players);

        Queue<Match> matchQueue = new LinkedList<>();
        Iterator<Player> it = players.iterator();

        // Schedule simple matches
        if (it.hasNext()) {
            Player p1 = it.next();
            if (it.hasNext()) {
                Player p2 = it.next();
                matchQueue.add(new Match(p1, p2));
            }
        }
        if (it.hasNext()) {
            Player p3 = it.next();
            if (it.hasNext()) {
                Player p4 = it.next();
                matchQueue.add(new Match(p3, p4));
            }
        }

        System.out.println("\nScheduled Matches: " + matchQueue);

        List<Result> results = new ArrayList<>();

        TreeSet<Score> leaderboard = new TreeSet<>();

        Random random = new Random();
        while (!matchQueue.isEmpty()) {
            Match match = matchQueue.poll();
            System.out.println("\nProcessing match: " + match);

            // Random winner
            if (random.nextBoolean()) {
                results.add(new Result(match.p1, match.p2, 10));
                leaderboard.add(new Score(match.p1.name, 10));
            } else {
                results.add(new Result(match.p2, match.p1, 10));
                leaderboard.add(new Score(match.p2.name, 10));
            }
        }

        System.out.println("\nMatch Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\n Leaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}
