//-----------------------------------------------------------------------------
// FileCopy.java
// Illustrates file IO
//-----------------------------------------------------------------------------

import java.io.*;
import java.util.Scanner;

class FileCopy{

/*
    public static String stringReverse(String s, int n) {

        if(n > 0) {
            // this prints to console
            // we need it to return a revered string  not print out a reversed string to stdout !!!
            System.out.print(s.substring(n-1,n));
            stringReverse(s, n-1);

        }
        return s;  //right now returns regular string s to output file.
    }
                    // retun a; WHERE a IS THE REVERSED STRING!!!!
*/

    public static String stringReverse(String s, int n) {
        char[] b = new char[n];
        char x;
        int z = 0;
        if(n > 0) {

            x = s.charAt(n-1);
            b[z] = x;
            stringReverse(s, n-1);
            z++;
        }
        return s = String.valueOf(b);
    }



   public static void main(String[] args) throws IOException{

      Scanner in = null;
      PrintWriter out = null;
      String line = null;
      int n;

      // check number of command line arguments is at least 2
      if(args.length < 2){
         System.out.println("Usage: FileCopy <input file> <output file>");
         System.exit(1);
      }

      // open files
      in = new Scanner(new File(args[0]));
      out = new PrintWriter(new FileWriter( args[1] ) );



      // read lines from in, write lines to out
      while( in.hasNextLine() ){
         line = in.nextLine();
         String temp = stringReverse(line, line.length());
         out.println( temp );
      }

      // close files
      in.close();
      out.close();
   }
}
