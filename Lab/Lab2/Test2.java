public class Test2 {


    public static void stringReverse(char[] X, int n, char[] Y) {
      if(n > 0) {
        Y[X.length - n] = X[n-1]; // n = X.length
        stringReverse(X, n-1, Y);
      }
   }
    /*public static String stringReverse(String s, int n) {

        if(n > 0) {
            System.out.print(s.substring(n-1,n));
            stringReverse(s, n-1);
        }
        return "BRRROOO!";
    }
*/
    public static void main(String[] args){
        String[] token = {"abc", "bar", "stool"};
        String string2 = token[1];
        char [] A = string2.toCharArray();
        char [] B = new char[A.length];

        stringReverse(A, A.length, B);
        System.out.println(B);



        //char[] A = {'a', 'b', 'c', 'd', 'e','f', 'g'};
        //char[] B = new char[A.length];

        //stringReverse(A, A.length, B);
        //System.out.println(B);


        //for(int i = A.length+1; i>=0; i--){
            //A[(i-1)] = B[A.length - i];
        //}

        //System.out.println(B);

        //stringReverse(A, A.length());

        //for(int i=0; i < p; i++){
        //    System.out.println(" "+token[i]);
        //}




    }
}
