package model;

public class Student {
    private int studentId; // DB id
    private String rollNo;
    private String name;
    private String course;
    private int marksMath;
    private int marksPhysics;
    private int marksChemistry;
    private int total;
    private double percentage;
    private String grade;

    public Student() {}

    public Student(String rollNo, String name, String course, int marksMath, int marksPhysics, int marksChemistry) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marksMath = marksMath;
        this.marksPhysics = marksPhysics;
        this.marksChemistry = marksChemistry;
        computeResults();
    }

    public void computeResults() {
        this.total = marksMath + marksPhysics + marksChemistry;
        this.percentage = total / 3.0;
        if (percentage >= 75) grade = "A";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 40) grade = "C";
        else grade = "F";
    }

    // getters and setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    public int getMarksMath() { return marksMath; }
    public void setMarksMath(int marksMath) { this.marksMath = marksMath; }
    public int getMarksPhysics() { return marksPhysics; }
    public void setMarksPhysics(int marksPhysics) { this.marksPhysics = marksPhysics; }
    public int getMarksChemistry() { return marksChemistry; }
    public void setMarksChemistry(int marksChemistry) { this.marksChemistry = marksChemistry; }
    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
    public double getPercentage() { return percentage; }
    public void setPercentage(double percentage) { this.percentage = percentage; }
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
