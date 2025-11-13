import java.util.*;

// Abstract base class for roles
abstract class JobRole {
    abstract void showResponsibilities();
}

// Subclasses for different roles
class SoftwareEngineer extends JobRole {
    void showResponsibilities() {
        System.out.println("Software Engineer: Develop, test, and deploy code 👨‍💻");
    }
}

class DataScientist extends JobRole {
    void showResponsibilities() {
        System.out.println("Data Scientist: Analyze data and build ML models 📊");
    }
}

class ProductManager extends JobRole {
    void showResponsibilities() {
        System.out.println("Product Manager: Define roadmap and manage features 🧭");
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    String candidateName;
    T jobRole;

    Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    void showResume() {
        System.out.println("Candidate: " + candidateName);
        jobRole.showResponsibilities();
    }
}

// Screening class with wildcard
class ResumeScreening {
    static void processResumes(List<? extends Resume<? extends JobRole>> resumes) {
        System.out.println("📂 Screening resumes...");
        for (Resume<? extends JobRole> r : resumes) {
            r.showResume();
            System.out.println();
        }
    }
}

public class ResumeSystemDemo {
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();
        resumes.add(new Resume<>("Aarav", new SoftwareEngineer()));
        resumes.add(new Resume<>("Meera", new DataScientist()));
        resumes.add(new Resume<>("Rohan", new ProductManager()));

        ResumeScreening.processResumes(resumes);
    }
}
