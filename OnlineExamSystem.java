import java.io.IOException;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String msg) { super(msg); }
}

public class OnlineExamSystem {

    public static void validateStudent(String name) throws InvalidStudentException {
        if (!name.equals("Devansh")) {
            throw new InvalidStudentException("Invalid student ID or name!");
        }
    }

    public static void submitExam(String name) throws InvalidStudentException, IOException {
        validateStudent(name);
        throw new IOException("Network issue during submission!");
    }

    public static void main(String[] args) {
        try {
            submitExam("Amit");
        } catch (InvalidStudentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
