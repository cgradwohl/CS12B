//-----------------------------------------------------------------------------
// BinarySearch.java
//-----------------------------------------------------------------------------

public class BinarySearch {

   // binarySearch()
   // pre: Array A[p..r] is sorted
   public static int binarySearch(int[] A, int p, int r,  int target){
      int q;
      // if 0 > r then we have an empty array
       if(p > r) {
         return -1;

      }else{
         q = (p+r)/2;

//  1.     // if the taget is at q then you are done
         if(target == A[q]){
            return q;

//  2.          // if the target is to the left of q do a recursive call from 0 to q-1
         }else if(target < A[q]){
            return binarySearch(A, p, q-1, target);

//  3.          // if the target is to the right of q do a recursive call from q+1 to r
         }else{ // target > A[q]
            return binarySearch(A, q+1, r, target);

         }
      }
   }

   public static void main(String[] args) {

      int[] B = {1,2,3,4,5,6,7,8,9,10};

      System.out.println(binarySearch(B, 0, B.length-1, 7));
      System.out.println(binarySearch(B, 0, B.length-1, 2));
      System.out.println(binarySearch(B, 0, B.length-1, 11));
   }
}
