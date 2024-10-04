public class majority_elements {
    static int majorityElement(int [] nums){

        int ans=0;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
            if(ans<count) {
                res = nums[i];
                ans = count;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {3,1,3};
        System.out.println(majorityElement(nums));
    }
}
