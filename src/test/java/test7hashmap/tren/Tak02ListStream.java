package test7hashmap.tren;

import java.util.List;

public class Tak02ListStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 8, 1, 9, 4);

        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n->n*n)
                .sorted()
                .toList();

        System.out.println(evenSquares);
    }
}
