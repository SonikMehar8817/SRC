import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class hash_map {
    public static void main(String[] args) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(4,6);
//        map.put(7,8);
////        System.out.println(map);
////        map.put(7,9);
////        System.out.println(map);
////        System.out.println(map.size());
////        System.out.println(map.get(7));
////        System.out.println(map.remove(4));
////        System.out.println(map);
////        System.out.println(map.containsKey(4));
//        map.put(2,3);
//        map.put(3,7);
//        map.put(-1,9);
//        System.out.println(map);
//
////        HashSet<Integer> s = new HashSet<>();
//
//        for(map.Entry<Integer,Integer>) e
                //give the unsorted array the frequency of the each of the array;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

//        System.out.println("Enter the value for rotation :");
//        int k = sc.nextInt();
        int arr [] = new int [size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<size;i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            }
            else
                map.put(arr[i],1);
        }
        System.out.println(map);


        //entry set
    }
}
