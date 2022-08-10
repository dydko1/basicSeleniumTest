package pl.sii.excersise.arrayList;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();
        String[] s = {"asd", "ddd", "ddd"};
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");
        l_list.addAll(Arrays.asList(s));

        System.out.println(l_list);
        Iterator p = l_list.listIterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        l_list.offerFirst("ddeeeeeeeeeeeeeeeeeeedd");
        l_list.remove(1);
        l_list.add(0,"dddddddddddd");
        System.out.println(l_list);
    }
}
