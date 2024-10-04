import java.util.Scanner;

public class Binary_search {
    //binary search works on sorted array as well as sorted and rotated array
    //binary search works on two pointer algo.
    //1.place two poiters one in the begning one in the last
    // * 2.calculate the mid
    // * 3    1. if the middle is equale to the key return mid index.
    // *      2. if key is greater then mid move to the right [i=mid+1]
    // *      3. if key is less the mid move to the left [i=mid-1]
    // * 4.repeate step two and three until the key is found.
    // * 5.if the key is not present in the array return -1.

    // for array single element we use <= and for array two element for comprasion we use < only

   // i+(j-i)/2;

   // Questions on bs:
   // 1.painters partitoning
   // 2.book allocation
   // 3.aggresive cows
   // 4.koko eation bananas

   /*
   *  sqrt(x)
   *  search in rs array
   *  find pivot element
   *  find peak element*/

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array :");
      int n = sc.nextInt();
      System.out.println("Enter the key :");
      int key = sc.nextInt();
      int [] arr = new int[n];

      for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
      }
      int ans = -1;
      int i=0,j=n-1;
      while (i<=j){
         int mid = (i+j)/2;
         if(key == arr[mid]){
            ans = mid;
            break;
         }
         else if(key > arr[mid]) {
            i = mid - 1;
         }
         else {
            j = mid - 1;
         }
      }
      System.out.println(ans);

   }
   }
