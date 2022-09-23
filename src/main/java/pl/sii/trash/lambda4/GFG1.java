package pl.sii.trash.lambda4;

import java.util.stream.Stream;

class GFG1 {
    public static void main(String[] args)
    {

        // Get the stream
        Stream<String> stream
            = Stream.of("Geeks", "For",
                        "Geeks", "A",
                        "Computer",
                        "Portal");
  
        // Print the stream
        stream.forEach(s -> System.out.println(s));
    }
}