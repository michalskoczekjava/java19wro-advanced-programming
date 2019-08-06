import hashSet.StringHashSet;

import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Application {

    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//        experimentWithArrayList(10_000);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        long start2 = System.currentTimeMillis();
//        experimentWithHashSet(10_000);
//        long end2 = System.currentTimeMillis();
//        System.out.println(end2 - start2);


        Set<String>set = new StringHashSet();
        set.add("Ala");
        set.add("Alan");
        set.add("Jakub");
        set.add("Marek");
        set.add("Marek");

        System.out.println(set);
    }

    private static void experimentWithArrayList(int size){
        List<Integer> numbers = IntStream.range(0, size)
                .boxed()
                .collect(toList());

        for (int i = size / 2; i < 1.5 * size; i++) {
            boolean contains = numbers.contains(i);
        }
    }
    private static void experimentWithHashSet(int size){
        Set<Integer> numbers = IntStream.range(0, size)
                .boxed()
                .collect(toSet());

        for (int i = size / 2; i < 1.5 * size; i++) {
            boolean contains = numbers.contains(i);
        }
    }


}
