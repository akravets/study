import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Leet387 {
    public static void main(String[] args) {
        String s = "leetcode";
        int i = firstUniqueChar(s);
        System.out.println(i);
    }

    public static int firstUniqueChar(String s){
        String[] split = s.split("");
        Map<String, Integer> charMap = new HashMap<>();

        for(int i = 0; i < split.length; i++) {
            if(!charMap.containsKey(split)){
                charMap.put(split[i], 1);
            }
            else{
                int val = charMap.get(split[i]).intValue();
                charMap.replace(split[i], val++);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = charMap.entrySet().iterator();

        int index = 0;

        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            if(next.getValue().intValue() == 1){
                return index;
            }
            index++;
        }
        return -1;
    }
}
