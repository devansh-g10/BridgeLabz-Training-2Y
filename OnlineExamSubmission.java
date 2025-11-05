import java.time.*;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String msg) { super(msg); }
}
class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String msg) { super(msg); }
}

public class OnlineExamSubmission {
    static LocalDateTime deadline = LocalDateTime.of(2025, 11, 1, 23, 59);

    public static void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Submission failed: invalid file format.");
        if (submissionTime.isAfter(deadline))
            throw new LateSubmissionException("Submission failed: submitted after deadline.");
        System.out.println("Exam submitted successfully ✅");
    }

    public static void main(String[] args) {
        try {
            submitExam("answer.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
