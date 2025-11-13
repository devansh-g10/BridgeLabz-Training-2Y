import java.util.*;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + " (" + score + ")";
    }
}

public class CollegeAdmissionSystem {
    public static void main(String[] args) {
        // PriorityQueue for high-score priority (max heap)
        PriorityQueue<Student> pq = new PriorityQueue<>(
            (a, b) -> b.score - a.score // higher score first
        );

        // Queue for waiting list
        Queue<Student> waitingList = new LinkedList<>();

        //  Map for admission record
        Map<Integer, Student> admissionList = new HashMap<>();

        // Total seats available
        int totalSeats = 3;

        //  Add student applications
        pq.add(new Student("Riya", 89));
        pq.add(new Student("Amit", 95));
        pq.add(new Student("Sara", 78));
        pq.add(new Student("Dev", 92));
        pq.add(new Student("Karan", 85));

        //  Fill available seats
        int seatNo = 1;
        while (!pq.isEmpty()) {
            Student s = pq.poll();
            if (seatNo <= totalSeats) {
                admissionList.put(seatNo, s);
                seatNo++;
            } else {
                waitingList.add(s);
            }
        }

        //  Display admitted students
        System.out.println("🎓 Admitted Students:");
        for (Map.Entry<Integer, Student> entry : admissionList.entrySet()) {
            System.out.println("Seat " + entry.getKey() + ": " + entry.getValue());
        }

        //  Display waiting list
        System.out.println("\n Waiting List:");
        for (Student s : waitingList) {
            System.out.println(s);
        }

        //  If a seat is canceled, next waiting student gets admitted
        System.out.println("\n⚡ Seat 2 canceled!");
        admissionList.remove(2);

        if (!waitingList.isEmpty()) {
            Student next = waitingList.poll();
            admissionList.put(2, next);
            System.out.println("New Admission (Seat 2): " + next);
        }

        //  Final list after update
        System.out.println("\n Final Admission List:");
        for (Map.Entry<Integer, Student> entry : admissionList.entrySet()) {
            System.out.println("Seat " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
