//-----------------------------------------------------------------------------
// MergeSort.java
//-----------------------------------------------------------------------------

public class MergeSort {

   // mergeSort()
   // sort subarray A[p...r]
   public static void mergeSort(int[] A, int p, int r){
      int q;
      if(p < r) {
         q = (p+r)/2;
         // System.out.println(p+" "+q+" "+r);

         //1.
         mergeSort(A, p, q);
        //2.
         mergeSort(A, q+1, r);
         //3.
         merge(A, p, q, r);
      }
   }

   // merge()
   // merges sorted subarrays A[p..q] and A[q+1..r]
   public static void merge(int[] A, int p, int q, int r){
      int n1 = q-p+1;
      int n2 = r-q;
      int[] L = new int[n1];
      int[] R = new int[n2];
      int i, j, k;

      for(i=0; i<n1; i++) L[i] = A[p+i]; // copy array A into left sub array
      for(j=0; j<n2; j++) R[j] = A[q+j+1]; // copy array A into left sun array

      i = 0; j = 0; // reset counters i,j values to 0

      for(k=p; k<=r; k++){
         if( i<n1 && j<n2 ){
            if( L[i]<R[j] ){
               A[k] = L[i];
               i++;
            }else{
               A[k] = R[j];
               j++;
            }
         }else if( i<n1 ){
            A[k] = L[i];
            i++;
         }else{ // j<n2
            A[k] = R[j];
            j++;
         }
      }
   }

   public static void main(String[] args) {

      int[] B = {5,6,3,5,8,6,5,2,3,4,2,4,6,5,4,7,6,8,9};

      mergeSort(B, 0, B.length-1);
      for(int i=0; i<B.length; i++) System.out.print(B[i]+" ");
      System.out.println();
   }
}
