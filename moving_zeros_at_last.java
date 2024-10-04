import java.util.Scanner;

public class moving_zeros_at_last {
    static  void movingZoroAtLast(int [] arr){
        int j = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                int temp = arr[i];
//                arr[i]=arr[j];
//                arr[j]= temp;
//                j++;
//            }
//        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int arr [] = new int [size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        movingZoroAtLast(arr);
    }
}
