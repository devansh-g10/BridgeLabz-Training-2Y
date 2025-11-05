import java.io.*;

class FileHandler {
    public FileHandler(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("File not found: " + filePath);
        }
        System.out.println("File found successfully!");
    }
}

public class ExceptionPropagationInConstructors {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("missing.txt");
        } catch (IOException e) {
            System.out.println("Error while creating FileHandler: " + e.getMessage());
        }
    }
}
