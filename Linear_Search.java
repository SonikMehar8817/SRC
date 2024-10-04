import java.util.Scanner;

public class Linear_Search {
    static int linear_searh(int [] arr,int n,int element){
//        for(int i=0;i<n;i++){
//            if(arr[i]==element){
//                return i;
//            }
//        }
//        return -1;
        for(int i=0;i<n;i++){
            if(arr[i]==element)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");

        int n = sc.nextInt();
        System.out.println("Enter the element which you want to find:");
        int element = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Index of element which you want to find :"+ linear_searh(arr,n,element));
    }
}
