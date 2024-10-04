import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int [] arr = new int [4];

//        int arr [] = new int [4];
//
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 4;
//        arr[3] = 55;

//        int [] arr = {1,5,3,6};

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int j = 0;j<size;j++){
            arr[j] = sc.nextInt();
        }
        System.out.println("The output is :");
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
           if (max<arr[i]){
               max = arr[i];
           }
        }
//        System.out.println("Maximum value is :"+max);

        int secMax = Integer.MIN_VALUE;

        for(int k = 0;k<size;k++){
            if(secMax <arr[k] && arr[k]!=max){
                secMax = arr[k];
            }
        }
//        System.out.println("Secound maximum is :"+secMax);

        int thirdMax = Integer.MIN_VALUE;

        for(int l= 0;l<size;l++){
            if (thirdMax<arr[l] && arr[l]<secMax)
                thirdMax = arr[l];
        }

        System.out.println("Third maximum value is :"+thirdMax);


    }
}