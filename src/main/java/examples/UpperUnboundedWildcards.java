package examples;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperUnboundedWildcards {
    public static void main(String[] args) {
        // ? Wilcards
        // Upper Unbounded Wildcards
        List<Object> list1 = Arrays.asList(1, "2", new Date());
        List<Integer> list2 = Arrays.asList(5, 6);
        List<String> list3 = Arrays.asList("A", "B", "C");
       // print(list1);
        print(list2);
        //print(list3);
    }

    static void print(List<? extends Number> list) {
        list.forEach(
                e -> {
                    System.out.println(e.getClass().getName());
                    System.out.println(e);
                });
    }
}
