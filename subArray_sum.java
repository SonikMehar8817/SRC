public class subArray_sum {
    static void sumOfSubArray(int []arr){

        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                System.out.println(sum);
            }
        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                int sum = 0;
//                for(int k=i;k<=j;k++)
//                    sum+=arr[k];
//                System.out.println(sum);
//            }
//        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        sumOfSubArray(arr);
    }
}
