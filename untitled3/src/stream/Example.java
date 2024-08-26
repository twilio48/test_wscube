package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,7,5,6,3);
       list.stream().filter(n->n%2==0).map(n->n*2).forEach(n-> System.out.println(n));
        Stream<String> stream = Stream.of("A", "B", "C");
        stream.forEach(n-> System.out.println(n));




    }
}