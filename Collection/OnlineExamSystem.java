import java.util.*;

class Question {
    String text;
    public Question(String text) {
        this.text = text;
    }
    public String toString() {
        return text;
    }
}

class Student {
    String id;
    public Student(String id) {
        this.id = id;
    }
    public String toString() {
        return id;
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        // ✅ 1. Store all questions
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("What is Java?"));
        questionList.add(new Question("Explain OOPs concepts."));
        questionList.add(new Question("What is inheritance?"));

        // ✅ 2. Store unique student IDs
        Set<String> studentSet = new HashSet<>();
        studentSet.add("STU101");
        studentSet.add("STU102");
        studentSet.add("STU101");  // duplicate ignored

        System.out.println("Unique Students: " + studentSet);

        // ✅ 3. Queue for students waiting to take test
        Queue<Student> examQueue = new LinkedList<>();
        for (String id : studentSet) {
            examQueue.offer(new Student(id));
        }

        // ✅ 4. Randomize questions
        Collections.shuffle(questionList);
        System.out.println("\nRandomized Questions: " + questionList);

        // ✅ 5. Student takes exam in order
        while (!examQueue.isEmpty()) {
            Student current = examQueue.poll();
            System.out.println("\nServing student: " + current);
            
            Stack<Question> questionStack = new Stack<>();
            for (Question q : questionList) {
                questionStack.push(q);
                System.out.println("Current Question: " + q);
            }
            
            // ✅ Back functionality
            System.out.println("Going back to previous question: " + questionStack.pop());
        }
    }
}
