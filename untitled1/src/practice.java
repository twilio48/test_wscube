import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class practice {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add(null);
        set.add("a");
        set.add("b");
        set.add("d");
        System.out.println(set);
    }
}