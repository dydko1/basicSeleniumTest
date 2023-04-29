package pl.sii.trash.lambda6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Builder
@ToString
@Data
@Accessors(chain = true)
class Person {
    String name;
    int age;
}