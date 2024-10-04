public class max_product_in_subArray {
    static int max_product(int [] arr){
        int ans = Integer.MIN_VALUE;
        double pro=1;
        for(int i =0;i<arr.length;i++){
            pro *= arr[i];
            if(ans<pro)
                ans=(int)pro;
        }
        int ans2 = Integer.MIN_VALUE;
        double pro2 = 1;
        for(int i=arr.length-1;i>=0;i--){
            pro2 *= arr[i];
            if(ans2<pro2)
                ans2=(int)pro2;
        }
        return Math.max(ans,ans2);
    }

    public static void main(String[] args) {
        int [] arr = {-1,2,3,-2,-5,3};
        System.out.println("Maximum product in subarray is :"+ max_product(arr));
    }

}
