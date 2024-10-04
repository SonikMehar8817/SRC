import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7};
//
//        for(int i=0;i<arr.length/2;i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i]= temp;
//        }

        //by 2 pointer algo

        int x =0,y=arr.length-1;

        while (x<y){
            int temp = arr[x];
            arr[x]=arr[y];
            arr[y]=temp;

            x++;
            y--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

//    static  boolean sortArr(int [] arr){
////        int count = 0;
////        for(int i = 0;i<arr.length-1;i++){
////            if(arr[i]<arr[i+1]){
////                count++;
////            }
////        }
////        if(count == arr.length-1)
////             return true;
////        else
////            return false;
//        for(int i =0;i< arr.length-1;i++){
//            if(arr[i]>arr[i+1])
//                return  false;
//
//        }
//        return true;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array :");
//
//
//
//        int n = sc.nextInt();
//
//        int [] arr = new int [n];
//
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
////        if (sortArr(arr))
////            System.out.println("shorted");
////        else
////            System.out.println("not");
////        int k = 1;
////        for(int i=0 ;i<n/2;i++){
////            int temp = arr[i];
////            arr[i] = arr[n-k];
////            arr[n-k]=temp;
////            k++;
////        }
//
//
//        //using 2 pointer algo
//
//
//        int r=0,j=n-1;
//        while(r<j){
//            int temp = arr[r];
//            arr[r]=arr[j];
//            arr[j]=temp;
//            r++;
//            j--;
//        }
//        for(int i = 0;i<n;i++){
//            System.out.println(arr[i]);
//        }
//
//
//
////
////        int sum = 0;
////        int prod = 1;
////
////        for(int i = 0;i<n;i++){
////            sum += arr[i];
////            prod *= arr[i];
////        }
////
////        System.out.println("sum is :"+sum);
////        System.out.println("product is :"+prod);
//    }
}
