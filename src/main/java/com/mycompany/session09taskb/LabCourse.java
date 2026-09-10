
package com.mycompany.session09taskb;
// Concrete subclass extending Course[cite: 1]
public class LabCourse extends Course {

    // Constructor chaining invoking super(name)[cite: 1]
    public LabCourse(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Lab";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}