import java.util.Scanner;

public class duplicate_element {
    static  void  duplicateElement(int [] nums){

        int k = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]= nums[i];
                k++;
            }
        }
        nums[k]=nums[nums.length-1];

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
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

        duplicateElement(arr);
    }

}
