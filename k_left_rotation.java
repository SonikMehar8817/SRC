import java.util.Scanner;

public class k_left_rotation {
    static void rotat(int [] arr,int k){
        int size = arr.length;

        reverse(arr,0,size-1);
        reverse(arr,0,k);
        reverse(arr,k+1,size-1);

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

