package examples;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LowerUnboundedWilcards {
    public static void main(String[] args) {
        // ? Wilcards
        // Lower Unbounded Wildcards
        List<Object> list1 = Arrays.asList(1, "2", new Date());
        List<Integer> list2 = Arrays.asList(5, 6);
        List<String> list3 = Arrays.asList("A", "B", "C");
        // print(list1);
        print(list2);
        //print(list3);
    }

    static void print(List<? super Integer> list) {
        list.forEach(
                e -> {
                    System.out.println(e.getClass().getName());
                    System.out.println(e);
                });
    }
}
