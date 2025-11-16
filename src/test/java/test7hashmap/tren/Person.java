package test7hashmap.tren;

import lombok.Data;

@Data
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}