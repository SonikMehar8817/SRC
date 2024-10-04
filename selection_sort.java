public class selection_sort {
    static  void selectionSort(int [] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=arr.length-1;j>0+i;j--){
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] arr = {6,3,7,2,8,1};
        selectionSort(arr);
    }
}
