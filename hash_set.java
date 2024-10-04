import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //serch
//        System.out.println(set);
//        set.remove(1);
//        System.out.println(set.size());

        Iterator it = set.iterator();

//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.next());
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
