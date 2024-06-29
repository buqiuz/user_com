package com.cqu;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void addTest(){
        App app = new App();

        Student student = new Student();
        student.setId(18);
        student.setName("18");
        student.setAge(18);
        student.setMajor("18");
        student.setGrade(18);
        System.out.println("id："+student.getId());

        System.out.println("name:"+student.getName());

        System.out.println("age:"+student.getAge());

        System.out.println("major:"+student.getMajor());

        System.out.println("grade:"+student.getGrade());

        app.addStudent(student);
    }
    @Test
    public void deleteTest(){
        App app = new App();
        app.deleteStudentById(18);
    }
    @Test
    public void updateTest(){
        App app = new App();
        Student student = new Student();
        student.setId(18);
        student.setName("18");
        student.setAge(18);
        student.setMajor("18");
        student.setGrade(19);
        app.updateStudent(student);
    }
}
