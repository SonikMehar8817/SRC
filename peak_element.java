public class peak_element {
    static  int peakElement(int [] nums){
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};
        System.out.println(peakElement(nums));
    }

}
