package com.cqu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "2667151";
    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public void addStudent(Student student){
        String sql = "INSERT INTO student VALUES(?,?,?,?,?)";
        try(Connection conn=getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)) {
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setInt(3, student.getAge());
            pstmt.setString(4,student.getMajor());
            pstmt.setInt(5,student.getGrade());
            pstmt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void deleteStudentById(int id){
        String sql = "DELETE FROM student WHERE id=?";
        try(Connection conn=getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void updateStudent(Student student){
        String sql = "UPDATE student SET name=?,age=?,major=?,grade=? WHERE id=?";
        try(Connection conn=getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());
            pstmt.setString(3,student.getMajor());
            pstmt.setInt(4,student.getGrade());
            pstmt.setInt(5,student.getId());
            pstmt.executeUpdate();
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
