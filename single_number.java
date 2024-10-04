import java.util.Scanner;

public class single_number {
    static int singleNumber(int [] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int arr [] = new int [size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("single element is :");
        System.out.println(singleNumber(arr));


    }
}
