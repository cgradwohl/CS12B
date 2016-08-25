// FileReverse.java
import java.io.*;
import java.util.Scanner;

class FileReverse {

    public static String stringReverse(String s, int n){
        if (n <= 1) {
            return s;
        }
        return stringReverse(s.substring(1, s.length()), n-1) + s.charAt(0);
    }

    public static void main(String[] args) throws IOException{
        Scanner in = null;
        PrintWriter out = null;
        String line = null;
        String[] token = null;
        int i, n, lineNumber = 0;

        if(args.length < 2){
            System.out.println("Usage: FileCopy <input file> <output file>");
            System.exit(1);
        }

        in = new Scanner(new File(args[0]));
        out = new PrintWriter(new FileWriter(args[1]));

        while( in.hasNextLine() ){

            line = in.nextLine().trim() + " ";
            token = line.split("\\s+");

            n = token.length;

                for(i=0; i<n; i++){
                    out.println(" "+stringReverse(token[i], token[i].length()));
                }
        }

    in.close();
    out.close();
    }
}
