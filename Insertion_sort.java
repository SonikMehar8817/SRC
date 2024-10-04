public class Insertion_sort {
    static  void InsertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i-1,x=arr[i];
            while(j>=0&&arr[j]>x){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=x;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {8,65,23,1 ,9,10};
        InsertionSort(arr);
    }
}
