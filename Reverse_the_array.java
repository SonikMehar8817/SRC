import java.util.Scanner;

public class Reverse_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of a array :");
        int size = sc.nextInt();

        int arr [] = new int[size];

        for (int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }

//        for(int i = 0;i<size-1;i++){
//            int temp = arr[i];
//            arr[i] = arr[size-i-1];
//            arr[size-i-1] = temp;
//        }
//
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]);
//        }

        //reverse the array by 2 pointer algorithm

        int r=0 , s = size-1;

        while(r<s){
            int temp = arr[r];
            arr[r]=arr[s];
            arr[s] = temp;
            r++;
            s--;
        }

        System.out.println("Reverse array is :");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
