package dao;

import db.DatabaseManager;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public int addStudent(Student s) throws SQLException {
        String sql = "INSERT INTO students (roll_no, name, course, marks_math, marks_physics, marks_chemistry, total, percentage, grade) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, s.getRollNo());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getMarksMath());
            ps.setInt(5, s.getMarksPhysics());
            ps.setInt(6, s.getMarksChemistry());
            ps.setInt(7, s.getTotal());
            ps.setDouble(8, s.getPercentage());
            ps.setString(9, s.getGrade());
            int affected = ps.executeUpdate();

            if (affected == 0) return -1;
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
            return -1;
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Student s = new Student();
                s.setStudentId(rs.getInt("student_id"));
                s.setRollNo(rs.getString("roll_no"));
                s.setName(rs.getString("name"));
                s.setCourse(rs.getString("course"));
                s.setMarksMath(rs.getInt("marks_math"));
                s.setMarksPhysics(rs.getInt("marks_physics"));
                s.setMarksChemistry(rs.getInt("marks_chemistry"));
                s.setTotal(rs.getInt("total"));
                s.setPercentage(rs.getDouble("percentage"));
                s.setGrade(rs.getString("grade"));
                list.add(s);
            }
        }
        return list;
    }

    public Student findByRollNo(String rollNo) throws SQLException {
        String sql = "SELECT * FROM students WHERE roll_no = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, rollNo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Student s = new Student();
                    s.setStudentId(rs.getInt("student_id"));
                    s.setRollNo(rs.getString("roll_no"));
                    s.setName(rs.getString("name"));
                    s.setCourse(rs.getString("course"));
                    s.setMarksMath(rs.getInt("marks_math"));
                    s.setMarksPhysics(rs.getInt("marks_physics"));
                    s.setMarksChemistry(rs.getInt("marks_chemistry"));
                    s.setTotal(rs.getInt("total"));
                    s.setPercentage(rs.getDouble("percentage"));
                    s.setGrade(rs.getString("grade"));
                    return s;
                }
            }
        }
        return null;
    }

    public boolean updateStudent(Student s) throws SQLException {
        String sql = "UPDATE students SET name=?, course=?, marks_math=?, marks_physics=?, marks_chemistry=?, total=?, percentage=?, grade=? WHERE roll_no=?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setInt(3, s.getMarksMath());
            ps.setInt(4, s.getMarksPhysics());
            ps.setInt(5, s.getMarksChemistry());
            ps.setInt(6, s.getTotal());
            ps.setDouble(7, s.getPercentage());
            ps.setString(8, s.getGrade());
            ps.setString(9, s.getRollNo());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean deleteByRollNo(String rollNo) throws SQLException {
        String sql = "DELETE FROM students WHERE roll_no = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, rollNo);
            return ps.executeUpdate() > 0;
        }
    }
}
