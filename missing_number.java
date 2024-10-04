import java.util.Scanner;

public class missing_number {
    static int missingNumber(int [] num){
        int n = num.length;
        int sumOfNumbers = (n*(n+1))/2;
        int sum = 0;

        for(int i=0;i<num.length;i++){
            sum += num[i];
        }

        return sumOfNumbers-sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int arr [] = new int [size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("missing element is :");
        System.out.println(missingNumber(arr));
    }
}
