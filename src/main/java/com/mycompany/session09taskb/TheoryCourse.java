
package com.mycompany.session09taskb;

// Concrete subclass extending Course[cite: 1]
public class TheoryCourse extends Course {

    // Constructor chaining invoking super(name)[cite: 1]
    public TheoryCourse(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Theory";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}