import java.util.Scanner;

//1. reverse the array
//2. Starting ke 'k' elements reverse
//3. 'k' ke baad ke elemend reverse
public class right_shift {

    static  void k_rotation(int arr [],int k){
        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    static void reverse(int arr[],int r,int s){
        while (r<s){
            int temp = arr[r];
            arr[r]=arr[s];
            arr[s]=temp;
            r++;
            s--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        System.out.println("Enter the value for rotation :");
        int k = sc.nextInt();
        int arr [] = new int [size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        k_rotation(arr,k);

//        int temp = arr[size-1];
//        for(int i=size-1;i>0;i--){
//            arr[i]=arr[i-1];
//
//        }
//        arr[0]=temp;

        //k rotation
//        for(int j=0;j<3;j++){
//            int temp = arr[size-1];
//            for(int i=size-1;i>0;i--){
//                arr[i]=arr[i-1];
//
//            }
//            arr[0]=temp;
//        }

//        int j = sc.nextInt();
//
//        for(int k=1;k<=j;k++) {
//            int temp = arr[size-1];
//            for(int i = size-1; i>0; i--){
//
//                arr[i] = arr[i-1];
//            }
//            arr[0] = temp;
//            System.out.println("-------------------");
//        }
        System.out.println("The output is :");

            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }

    }
}
