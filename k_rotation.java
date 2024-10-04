import java.util.Scanner;

public class k_rotation {

    static void rotat(int [] arr,int k){
        int size = arr.length;

        reverse(arr,0,size-1);
        reverse(arr,0,k-1);
        reverse(arr,k-1,size-1);

    }

    static void reverse(int [] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the number of rotation time :");
        int k = sc.nextInt();
        int arr [] = new int [size];

        System.out.println("Enter the array elements :");
        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }


        rotat(arr,k);

        for(int i:arr){
            System.out.println(i);
        }
    }
}
//left rotation
//1 2 3 4 5 6 7
//2 3 4 5 6 7 1
//3 4 5 6 7 1 2

//right rotation
//1 2 3 4 5
//5 1 2 3 4
//4 5 1 2 3
