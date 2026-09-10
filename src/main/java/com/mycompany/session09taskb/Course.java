
package com.mycompany.session09taskb;

// Abstract base class that cannot be directly instantiated[cite: 1]
public abstract class Course {
    private String name;

    // Constructor used for constructor chaining in subclasses[cite: 1]
    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method implemented by concrete course types[cite: 1]
    public abstract String getType();

    @Override
    public String toString() {
        return "Course Name: " + name + " | Type: " + getType();
    }
}