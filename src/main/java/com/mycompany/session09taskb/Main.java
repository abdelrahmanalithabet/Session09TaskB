
package com.mycompany.session09taskb;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Create a Department[cite: 1]
        Department dept = new Department("Software Testing");

        // 2. Instantiate Theory and Lab courses polymorphically[cite: 1]
        Course javaTheory = new TheoryCourse("Java Fundamentals");
        Course testingTheory = new TheoryCourse("Software Testing Principles");
        Course dbTheory = new TheoryCourse("Database Systems");

        Course javaLab = new LabCourse("Java Automation Lab");
        Course seleniumLab = new LabCourse("Selenium WebDriver Lab");
        Course postmanLab = new LabCourse("Postman API Testing Lab");

        dept.addCourse(javaTheory);
        dept.addCourse(testingTheory);
        dept.addCourse(dbTheory);
        dept.addCourse(javaLab);
        dept.addCourse(seleniumLab);
        dept.addCourse(postmanLab);

        List<Course> availableCourses = dept.getCourses();

        String[] firstNames = {"Ahmed", "Mohamed", "Omar", "Youssef", "Mina", "Mahmoud", "Khaled", "Hassan", "Ali", "Ibrahim"};
        String[] lastNames = {"El-Sayed", "El-Din", "Abdelrahman", "Osman", "Younan", "Thabet", "Zaid", "Tarik", "Nabil", "Amer"};

        // 3. Generate 50 students and enroll each in Theory and Lab courses
        for (int i = 1; i <= 50; i++) {
            String studentId = String.format("STU-%03d", i);
            String fName = firstNames[(i - 1) % firstNames.length];
            String lName = lastNames[(i - 1) % lastNames.length];

            Student student = new Student(studentId, fName, lName);

            // Assign one Theory course (index 0-2) and one Lab course (index 3-5)
            Course assignedTheory = availableCourses.get((i - 1) % 3);
            Course assignedLab = availableCourses.get(3 + ((i - 1) % 3));

            student.enrollCourse(assignedTheory);
            student.enrollCourse(assignedLab);

            dept.addStudent(student);
        }

        // 4. Display all courses and enrolled student details[cite: 1]
        dept.displayDepartmentDetails();
    }
}