public class Recursion {

    public static void reverseArray1(int[] X, int n, int[] Y) {
      if(n > 0) {
        Y[X.length - n] = X[n-1];
        reverseArray1(X, n-1, Y);
      }
   }

   public static void reverseArray2(int[] X, int n, int[] Y) {
       if ( n > 0){
           reverseArray2(X, n-1, Y);
           Y[X.length - n] = X[n - 1];
       }
   }

   public static void reverseArray3(int[] X, int i, int j) {
       if (i < j) {
           int temp = X[i];
           X[i] = X[j];
           X[j] = temp;
           reverseArray3(X, i+1, j-1);
       }
   }

    public static int maxArrayIndex(int[] X, int p, int r) {
        int q;
        if (p < r){ // when the array is greater than length 1
            q = (p+r)/2;
            int i = maxArrayIndex(X, p, q); // left sub array
            int j = maxArrayIndex(X, q+1, r); // right sub array

            if (X[i] > X[j]) return i;
            else return j;
        }
        return p; // when the array is of length 1 return p=r 
    }

   public static int minArrayIndex(int[] X, int p, int r){
       int q;
       if(p < r) {
           q = (p+r)/2;
           int i = minArrayIndex(X, p, q); // left sub array
           int j = minArrayIndex(X, q+1, r); // right sub array

           if (X[i] < X[j]) return i;
           else return j;
        }
        return p;
    }

    public static void main(String[] args){

        int[] A = {-1, 2, 6, 12, 9, 2, -5, -2, 8, 5, 7};
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        int minIndex = minArrayIndex(A, 0, A.length-1);
        int maxIndex = maxArrayIndex(A, 0, A.length-1);

        for(int x: A) System.out.print(x+" ");
        System.out.println();
        System.out.println( "minIndex = " + minIndex );
        System.out.println( "maxIndex = " + maxIndex );

        reverseArray1(A, A.length, B);
        for(int x: B) System.out.print(x+" ");

        System.out.println();

        reverseArray2(A, A.length, C);
        for(int x: C) System.out.print(x+" ");

        System.out.println();

        reverseArray3(A, 0, A.length-1);
        for(int x: A) System.out.print(x+" ");

        System.out.println();

    }
}
