public class RevArray {


    public static void reverseArray1(int[] X, int n, int[] Y) {
      if(n > 0) {
        Y[X.length - n] = X[n-1];
        reverseArray1(X, n-1, Y);
      }
   }

/*
   // doesnt put back into array
   public static void reverseArray1(int[] A, int n) {
      // if n==0 do nothing
      if(n > 0) {
         System.out.print(A[n-1] + " "); // print nth element from left
         reverseArray1(A, n-1);       // print leftmost n-1 elements, reversed
      }
   }
*/
   public static void reverseArray2(int[] X, int n, int[] Y) {
       if ( n > 0){
           reverseArray2(X, n-1, Y);
           Y[X.length - n] = X[n - 1];
       }
   }


   public static void main(String[] args) {
       int[] A = {1, 2, 3, 4};
       int[] B = new int[A.length];
       int a = A.length;

       reverseArray1(A, a, B);

       for(int x:B){
           System.out.print(x + " ");
       }
   }
}
