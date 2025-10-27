class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class StudentManagementsSystem {

    public static void main(String[] args) {
        String name = "Devansh";
        int age = 19;           
        int[] marks = {85, 90, 95}; 

        try {
            if (name == null) {
                throw new NullPointerException("Name cannot be null!");
            }

            if (age < 18) {
                throw new InvalidAgeException("Student must be 18 or older!");
            }

            for (int mark : marks) {
                if (mark < 0 || mark > 100) {
                    throw new InvalidMarksException("Marks should be between 0 and 100!");
                }
            }

            double average = 0;
            try {
                average = (marks[0] + marks[1] + marks[2]) / 3.0;
            } catch (ArithmeticException e) {
                System.out.println("Error calculating average: " + e.getMessage());
            }

            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Average Marks: " + average);
            System.out.println("Accessing extra index: " + marks[3]);

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access invalid array index!");

        } finally {
            System.out.println("Result processing completed.");
        }
    }
}
