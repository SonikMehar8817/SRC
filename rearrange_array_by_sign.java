public class rearrange_array_by_sign {
    static void rearrangeArrayBySign(int nums []){
        int n = nums.length;
        int [] pos = new int [n/2];
        int [] neg = new int [n/2];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                pos[j]=nums[i];
                j++;
            }
            else {
                neg[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[j];
                j++;
            }
            else{
                nums[i]=neg[k];
                k++;
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,1,-4,-5,7,-8};
        rearrangeArrayBySign(arr);
    }
}
