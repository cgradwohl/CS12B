//-----------------------------------------------------------------------------
// BinarySearchString.java
//-----------------------------------------------------------------------------

public class BinarySearchString {

   // binarySearch() for string array
   // pre: Array A[p..r] is sorted alphabetacally
   public static int binarySearch(String[] A, int p, int r,  String target){
      int q;
      if(p > r) {
         return -1;
      }else{

         q = (p+r)/2;

//  1.  if the taget is at q then you are done
        if(target.compareTo(A[q]) == 0){
            return q;

//  2.  if the target is to the left of q do a recursive call from 0 to q-1
         }else if(target.compareTo(A[q]) < 0) {
            return binarySearch(A, p, q-1, target);

//  3.  if the target is to the right of q do a recursive call from q+1 to r
         }else{ // target > A[q]
            return binarySearch(A, q+1, r, target);
         }
      }
   }

   public static void main(String[] args) {

      String[] B = {"ant", "bass", "cat", "dog", "eel", "ferrit", "grasshoper", "hawk", "insect", "jackel"};

      System.out.println(binarySearch(B, 0, B.length-1, "cat"));
      System.out.println(binarySearch(B, 0, B.length-1, "bat"));
      System.out.println(binarySearch(B, 0, B.length-1, "zebra"));
   }
}
