// FileTokens1.java
// Illustrates file IO and tokenization of strings.
import java.io.*;
import java.util.Scanner;
class FileTokensA {

    public static void stringReverse(char[] X, int n, char[] Y) {
      if(n > 0) {
        Y[X.length - n] = X[n-1]; // n = X.length
        stringReverse(X, n-1, Y);
      }
   }

    public static void main(String[] args) throws IOException{
            Scanner in = null;
            PrintWriter out = null;
            String line = null;
            String[] token = null;
            char [] A = null;
            char [] B = null;
            int i, n = 0;

            // check number of command line arguments is at least 2
            if(args.length < 2){
                System.out.println("Usage: FileTokens <input file> <output file>");
                System.exit(1);
            }

            // open files
            in = new Scanner(new File(args[0]));
            out = new PrintWriter(new FileWriter(args[1]));

            // read lines from in, extract and print tokens from each line
            while( in.hasNextLine() ){

                // trim leading and trailing spaces, then add one trailing space so
                // split works on blank lines
                line = in.nextLine().trim() + " ";

                // split line around white space
                token = line.split("\\s+");
                n = token.length;

                for(int j = 0; j<n; j++){
                    A = token[j].toCharArray();
                    B = new char[A.length];
                    stringReverse(A, A.length, B);
                    // print out tokens
                    out.println(B);
                }
            }

            // close files
            in.close();
            out.close();

    }
}
