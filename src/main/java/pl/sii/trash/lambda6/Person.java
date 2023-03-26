package pl.sii.trash.lambda6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@Builder
@ToString
class Person {
    String name;
    int age;
}