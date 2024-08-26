import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hh {

    //string s1 = "racecar"
    //String s2 = "carrace"

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "carrace";
        if(areAnagram(str1,str2)){
            System.out.println("are anagram");
        }
        else{
            System.out.println("are not anagram");
        }
    }

    public static boolean areAnagram(String str1, String str2){
        String  cleanstr1 = str1.replaceAll("\\s","").toLowerCase();
        String  cleanstr2 = str2.replaceAll("\\s","").toLowerCase();

        if(cleanstr1.length() != cleanstr2.length()){
            return false;
        }

        char[] charArray1 = cleanstr1.toCharArray();
        char[] charArray2 = cleanstr2.toCharArray();

        Map<Character, Integer> frequencyMap1 = buildFrequencyMap(cleanstr1);
        Map<Character, Integer> frequencyMap2 = buildFrequencyMap(cleanstr2);

        return frequencyMap1.equals(frequencyMap2);
    }

    private static Map<Character, Integer> buildFrequencyMap(String str) {
        Map<Character ,Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0) +1);
        }
        return frequencyMap;
    }
}
