public class sqrt {
    static int sqrtX(int x){
        int arr[] = new int[x];
        for(int i=0;i<x;i++)
            arr[i] = i+1;

        int i=0,j=x-1;
        while (i<=j){
            int mid =i+(j-i)/2;

            if(mid*mid == x)
                return mid;
            else if(mid*mid >x){
                j = mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(sqrtX(12));
    }

}
