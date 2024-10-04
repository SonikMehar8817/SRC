import java.util.Scanner;

public class unique_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        int size = max + 1;
        int[] hash = new int[size];
        for (int i = 0; i < n; i++) {
            int index = arr[i];
            hash[index]++;
        }
//        for (int i = 0; i < hash.length; i++) {
//            System.out.println(hash[i]);
//        }

        int max_freq = Integer.MIN_VALUE;

        for (int i = 0; i < hash.length; i++) {
            max_freq = Math.max(max_freq, hash[i]);
        }
            int c = 0,count=1;
            for (int k = 0; k < hash.length; k++) {

                if (hash[k] == 1)
                    count = Math.min(count,k);
                if (hash[k] == max_freq)
                    c = Math.max(c, k);

            }
            System.out.println(c - count);
        }
    }

