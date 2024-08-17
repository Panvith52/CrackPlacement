import java.util.*;

public class Strings2 {
    public static void main(String[] args) {
        String s = "LoveLeetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map.get(c)==1)
                return s.indexOf(c);
        }
        return -1;
    }
}



