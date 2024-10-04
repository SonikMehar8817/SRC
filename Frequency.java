import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }
        int size = max+1;
        int []hash = new int[size];
        for(int i=0;i<n;i++){
            int index = arr[i];
            hash[index]++;
        }
//        for(int i=0;i<hash.length;i++){
//            System.out.println(hash[i]);
//        }

        int max_freq = Integer.MIN_VALUE;

        for(int i = 0;i<hash.length;i++){
            max_freq = Math.max(max_freq,hash[i]);
        }

        for(int i = 0;i<hash.length;i++){
            if(hash[i]==max_freq)
                System.out.println(i);
        }



    }
}
//16 31 4 23 3 25 11
//       given  an unsorted array print the element that has the highest frequence please note that if two or element have
//        same frequence print all them.

// given a set of numbers you have to find all unique numbers in the array.