package pl.sii.trash.lambda3;

import java.io.*;
import java.util.*;

// Class 1
// Helper class
// Object need to be sorted
class Person {

    private String name;
    private Integer age;

    // Constructor
    public Person(String name, int age) {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
    }

    // Getter-setters
    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}