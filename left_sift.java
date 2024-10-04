import java.util.Scanner;

public class left_sift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int arr [] = new int [size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];

        }
        arr[size-1]=temp;
//        int temp = arr[0];
//        for(int i = 0; i<size-1; i++){
//            arr[i] = arr[i+1];
//        }
//        arr[size-1] = temp;
        System.out.println("The output is :");
        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }


    }
}

// 1 2 3 4 5
// 5 1 2 3 4
