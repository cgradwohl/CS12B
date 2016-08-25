import java.io.*;
import java.util.Scanner;

public class SearchTest {

    public static void mergeSort(String[] A, int p, int r){
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
    public static void merge(String[] A, int p, int q, int r){
       int n1 = q-p+1;
       int n2 = r-q;
       String[] L = new String[n1];
       String[] R = new String[n2];
       int i, j, k;

       for(i=0; i<n1; i++) L[i] = A[p+i]; // copy array A into left sub array
       for(j=0; j<n2; j++) R[j] = A[q+j+1]; // copy array A into left sun array

       i = 0; j = 0; // reset counters i,j values to 0

       for(k=p; k<=r; k++){
          if( i<n1 && j<n2 ){
             if( L[i].compareTo(R[j]) < 0 ){
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

    public static String binarySearch(String[] A, int p, int r,  String target){
       int q;
       if(p > r) {
          return target+" not found";
       }else{

          q = (p+r)/2;

 //  1.  if the taget is at q then you are done
         if(target.compareTo(A[q]) == 0){
             return target+" found";

 //  2.  if the target is to the left of q do a recursive call from 0 to q-1
          }else if(target.compareTo(A[q]) < 0) {
             return binarySearch(A, p, q-1, target);

 //  3.  if the target is to the right of q do a recursive call from q+1 to r
          }else{ // target > A[q]
             return binarySearch(A, q+1, r, target);
          }
       }
    }

    public static void main(String[] args) throws IOException {


    // LC.java
       // check number of command line arguments
       if(args.length != 2){
          System.err.println("Usage: Search <file_name> <search_word> "); // Makefile has JAR file name as SEARCH
          System.exit(1);
       }

       // count the number of lines in file
       Scanner in = new Scanner(new File(args[0])); //args[1] will be the target
       in.useDelimiter("\\Z"); // matches the end of file character
       String s = in.next();  // read in whole file as a single String
       in.close();
       String[] words = s.split("\n");  // split s into individual lines
       String targetWord = new String(args[1]);
/*
       // extract length of the resulting array
       int lineCount = words.length;
       // print out number of lines in file
       System.out.println( args[0]+" contains "+lineCount+" lines" );
*/

       //prints out array words which is the array containing the words as elements
       //System.out.println("the UNSORTED word list:");
       //for(int i = 0; i<words.length; i++) System.out.println(words[i]);

       //System.out.println("The SORTED word list:");
       mergeSort(words, 0, words.length-1);
       //for(int i=0; i<words.length; i++) System.out.println(words[i]+" ");

       System.out.println(binarySearch(words, 0, words.length-1, targetWord));
    }


}
