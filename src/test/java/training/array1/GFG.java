package training.array1;

import java.util.*;

// Main class
public class GFG {

    // Main driver method
    public static void main(String args[]) {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.set(1, "FFFFFFFFFFFFF");
        ll.add("EEEE");


        for (String s : ll) {
            System.out.println(s);

        }
        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}