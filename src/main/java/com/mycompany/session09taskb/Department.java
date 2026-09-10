
package com.mycompany.session09taskb;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Course> courses;   // 1-to-many relationship with Course[cite: 1]
    private List<Student> students; // 1-to-many relationship with Student[cite: 1]

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayDepartmentDetails() {
        System.out.println("==================================================");
        System.out.println("DEPARTMENT: " + name);
        System.out.println("==================================================");
        
        System.out.println("\nOFFERED COURSES:");
        for (Course course : courses) {
            System.out.println(" - " + course); // Demonstrates toString() polymorphism[cite: 1]
        }

        System.out.println("\nENROLLED STUDENTS & THEIR COURSES:");
        for (Student student : students) {
            System.out.println("\n" + student);
            System.out.println("  Courses:");
            for (Course course : student.getEnrolledCourses()) {
                System.out.println("   * " + course.getName() + " [" + course.getType() + "]");
            }
        }
    }
}