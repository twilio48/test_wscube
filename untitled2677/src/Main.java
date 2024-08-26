import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,1,6,5);

        Map<Integer , Long> countMap = numbers.stream().collect(Collectors.groupingBy(i -> i,Collectors.counting()));
        List<Integer> duplcates = countMap.entrySet().stream().filter(entry ->entry.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplcates);

        int sum = numbers.stream().mapToInt((Integer::intValue)).sum();
        System.out.println(sum);


    }
}