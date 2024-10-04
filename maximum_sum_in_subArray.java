public class maximum_sum_in_subArray {
    //candans algorithm
    // HackerResume,overleaf(resume),deedy cv
    static  int maximumSumInSubArray(int arr []){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(ans<sum)
                ans = sum;
            if(sum<0)
                sum=0;
        }
//        for(int i=0;i<arr.length;i++){
//
//            int sum =0;
//            for(int j=i;j<arr.length;j++){
//                sum +=arr[j];
//            }
//            if(maxSum<sum){
//                maxSum = sum;
//            }
//        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {-1,2,3,-2,5,2};
        System.out.println("Maximum sum in subarray is :"+ maximumSumInSubArray(arr));
    }
}
