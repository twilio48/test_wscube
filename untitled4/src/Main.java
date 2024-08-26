import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       int[] array = {0,1,1,1,0,1};
      int count = Arrays.stream(array).reduce(0,(total, num) -> total + (num == 1 ? 1:0));
        System.out.println(count);
    }
}