package service;

import dao.StudentDAO;
import model.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private List<Student> students;
    private StudentDAO dao;

    public StudentService() {
        students = new ArrayList<>();
        dao = new StudentDAO();
        loadFromDB();
    }

    private void loadFromDB() {
        try {
            List<Student> fromDb = dao.getAllStudents();
            students.addAll(fromDb);
        } catch (SQLException e) {
            System.err.println("Warning: could not load students from DB: " + e.getMessage());
        }
    }

    public void addStudent(Student s) {
        s.computeResults();
        students.add(s);
        try {
            int id = dao.addStudent(s);
            if (id > 0) s.setStudentId(id);
        } catch (SQLException e) {
            System.err.println("DB error during insert: " + e.getMessage());
        }
    }

    public List<Student> listStudents() {
        return new ArrayList<>(students);
    }

    public Optional<Student> findByRoll(String rollNo) {
        return students.stream().filter(s -> s.getRollNo().equalsIgnoreCase(rollNo)).findFirst();
    }

    public boolean updateStudent(Student updated) {
        updated.computeResults();
        Optional<Student> opt = findByRoll(updated.getRollNo());
        if (opt.isPresent()) {
            Student s = opt.get();
            s.setName(updated.getName());
            s.setCourse(updated.getCourse());
            s.setMarksMath(updated.getMarksMath());
            s.setMarksPhysics(updated.getMarksPhysics());
            s.setMarksChemistry(updated.getMarksChemistry());
            s.computeResults();
            try {
                return dao.updateStudent(s);
            } catch (SQLException e) {
                System.err.println("DB error on update: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    public boolean deleteStudent(String rollNo) {
        boolean removed = students.removeIf(s -> s.getRollNo().equalsIgnoreCase(rollNo));
        try {
            dao.deleteByRollNo(rollNo);
        } catch (SQLException e) {
            System.err.println("DB error on delete: " + e.getMessage());
        }
        return removed;
    }
}
