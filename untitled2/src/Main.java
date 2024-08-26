import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
            int[] nums={1,2,3,1,1,3};
            int result = countGoodPairs(nums);
            System.out.println(result);

            // Implement your Solution
        }
        public static int countGoodPairs(int [] nums){
            Map<Integer, Integer> countMap = new HashMap<>();

            for(int num: nums)

                countMap.put(num, countMap.getOrDefault(num,0)+1);

        int goodPairCount=0;

        for(int count : countMap.values()){
            if(count>1){
                goodPairCount+=count*(count-1)/2;

            }

        }
        return goodPairCount;
    }

}


