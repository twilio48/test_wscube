import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    ArrayList<Emp> emps = new ArrayList<>();
    emps.add(new Emp("Dugesh","345627", 12));
    emps.add(new Emp("Ankit" ,"2314",263));
    emps.add(new Emp("Bhawi","897",78));
        System.out.println(emps);
        Collections.sort(emps,new IdComparator());
        System.out.println(emps);

        ArrayList<Emp> emp1 = new ArrayList<>(emps);
        Collections.sort(emp1, new NameComparator());
        System.out.println(emp1);
    }
}