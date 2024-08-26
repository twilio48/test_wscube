import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class gfg {
    public static void main(String[] args) {
    int [] x ={1,2,7,11,4,13};
    int target =9;
        findIndex(x,target);
    }
    public static void findIndex(int[] array, int target){
        for (int i = 0; i <array.length ; i++) {
            for (int j = i; j < array.length ; j++) {
                if(array[i] +array[j]==target){
                    System.out.println("Indexn of "+array[i]+ "is "+i);
                    System.out.println("Indexn of "+array[j]+ "is "+j);
                    return;
                }

            }

        }

    }
    }


