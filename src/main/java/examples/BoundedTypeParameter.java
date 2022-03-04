package examples;

public class BoundedTypeParameter {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3};
        System.out.println(countGreaterThan(numbers, 2));

        Double[] numbers2 = {1.50, 2.50, 3.50};
        System.out.println(countGreaterThan(numbers2, 8.0));
    }

    interface A {}
    interface B {}

    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
