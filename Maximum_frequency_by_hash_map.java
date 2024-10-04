import java.util.*;

public class Maximum_frequency_by_hash_map {
    static void maximumFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set =new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else
                map.put(arr[i], 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            max = Math.max(max, e.getValue());
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(max == e.getValue())
                System.out.println(e.getKey());
        }

//        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//            HashSet.add(e.getValue());
//        }
//        if(map.size()==set.size())
//            return true;
//        else
//            false;




    }

    public static void main(String[] args) {
        int [] arr={1,2,2,9,1,2,1};
        maximumFrequency(arr);
    }
}
