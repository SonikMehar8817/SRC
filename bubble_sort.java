public class bubble_sort {
    static  void bubbleSort(int [] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,4,1,5,8,9};
        bubbleSort(arr);
    }

}
