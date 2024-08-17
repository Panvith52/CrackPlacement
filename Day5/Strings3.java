//finding the difference between two strings
import java.util.*;
public class Strings3 {
    public static void main(String[] args) {
        String string1 = "a";
        String string2 = "aa";
        char difference = findDifference(string1, string2);
        System.out.println("Difference: " + difference);
    }
    public static char findDifference(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c: str2.toCharArray()){
            if(!map.containsKey(c)){
                return c;
            }
        }
        return ' ';
    }
}
