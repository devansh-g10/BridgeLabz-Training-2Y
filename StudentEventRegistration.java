import java.util.*;

// Generic class for Participant
class Participant<T> {
    private T rollNumber;
    private String name;
    private String branch;

    public Participant(T rollNumber, String name, String branch) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Branch: " + branch;
    }
}

// Event Registration System class
class EventRegistrationSystem<T> {
    private ArrayList<Participant<T>> registeredList;
    private LinkedList<Participant<T>> waitingList;
    private HashSet<T> rollNumberSet;
    private int maxParticipants;

    public EventRegistrationSystem(int maxParticipants) {
        this.maxParticipants = maxParticipants;
        registeredList = new ArrayList<>();
        waitingList = new LinkedList<>();
        rollNumberSet = new HashSet<>();
    }

    // Method to register a participant
    public void registerParticipant(Participant<T> participant) {
        if (rollNumberSet.contains(participant.getRollNumber())) {
            System.out.println("❌ Duplicate roll number! Registration failed for: " + participant.getName());
            return;
        }

        rollNumberSet.add(participant.getRollNumber());

        if (registeredList.size() < maxParticipants) {
            registeredList.add(participant);
            System.out.println("✅ Registered: " + participant.getName());
        } else {
            waitingList.add(participant);
            System.out.println("⚠️  Added to waiting list: " + participant.getName());
        }
    }

    // Method to cancel registration
    public void cancelRegistration(T rollNumber) {
        boolean removed = false;

        Iterator<Participant<T>> iterator = registeredList.iterator();
        while (iterator.hasNext()) {
            Participant<T> p = iterator.next();
            if (p.getRollNumber().equals(rollNumber)) {
                iterator.remove();
                rollNumberSet.remove(rollNumber);
                removed = true;
                System.out.println("🗑️  Registration canceled for: " + p.getName());

                // Move one from waiting list to main list if available
                if (!waitingList.isEmpty()) {
                    Participant<T> next = waitingList.removeFirst();
                    registeredList.add(next);
                    rollNumberSet.add(next.getRollNumber());
                    System.out.println("➡️  Moved from waiting list to main list: " + next.getName());
                }
                break;
            }
        }

        if (!removed) {
            System.out.println("⚠️  No participant found with roll number: " + rollNumber);
        }
    }

    // Method to display all registered participants
    public void displayRegistered() {
        System.out.println("\n🎯 Registered Participants:");
        if (registeredList.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            for (Participant<T> p : registeredList) {
                System.out.println(p);
            }
        }
    }

    // Method to display waiting list
    public void displayWaitingList() {
        System.out.println("\n🕓 Waiting List:");
        if (waitingList.isEmpty()) {
            System.out.println("No one on the waiting list.");
        } else {
            for (Participant<T> p : waitingList) {
                System.out.println(p);
            }
        }
    }
}

// Main class to test
public class StudentEventRegistration {
    public static void main(String[] args) {
        EventRegistrationSystem<Integer> event = new EventRegistrationSystem<>(3);

        Participant<Integer> p1 = new Participant<>(101, "Amit", "CSE");
        Participant<Integer> p2 = new Participant<>(102, "Riya", "ECE");
        Participant<Integer> p3 = new Participant<>(103, "Karan", "ME");
        Participant<Integer> p4 = new Participant<>(104, "Sneha", "IT");

        // Registering participants
        event.registerParticipant(p1);
        event.registerParticipant(p2);
        event.registerParticipant(p3);
        event.registerParticipant(p4);

        // Display all
        event.displayRegistered();
        event.displayWaitingList();

        // Cancel one registration
        event.cancelRegistration(102);

        // Display after cancellation
        event.displayRegistered();
        event.displayWaitingList();
    }
}
