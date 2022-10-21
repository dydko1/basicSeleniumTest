package w3schools.optional;

import java.util.Optional;

public class TestExample {
    public static void main(String args[]) {
        String[] str = new String[10];
        // Setting value for 4th index
        str[4] = "Optional class example by W3spoint";
        // It returns an empty instance of Optional class   
        Optional<String> empty = Optional.empty();
        System.out.println("xx:\t" + empty);
        // It returns a non-empty Optional  
        Optional<String> value = Optional.of(str[4]);
        System.out.println(value);
        // If value is present, it returns an Optional otherwise returns an empty Optional  
        System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc")));
//        System.out.println("Filtered value: " + value.filter((s) -> s.equals("Optional class example by W3spoint")));
//        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
//        System.out.println("Getting value: " + value.get());
//        // It returns hashCode of the value
//        System.out.println("Getting hashCode: " + value.hashCode());
//        // It returns true if value is present, otherwise false
//        System.out.println("Is value present: " + value.isPresent());
//        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
//        System.out.println("Nullable Optional: " + Optional.ofNullable(str[5]));
//        // It returns value if available, otherwise returns specified value,
//        System.out.println("orElse: " + value.orElse("Value is not present"));
//        System.out.println("orElse: " + empty.orElse("Value is not present"));
//        //printing value by using method reference
//        value.ifPresent(System.out::println);
    }
}