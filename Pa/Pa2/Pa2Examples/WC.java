//-----------------------------------------------------------------------------
// WC.java
// Slightly better implementation of wc in java.  Seems to get the number of
// characters in the file correct, unlike WordCount.java. Still needs some work
// though.
//-----------------------------------------------------------------------------

import java.io.*;
import java.util.Scanner;

class WC {

   public static void main(String[] args) throws IOException {

      Scanner fileScanner;
      String fileContents;
      String[] lineArray, wordArray;

      int lineCount, wordCount, charCount, i, j, k;
      String content, line;
      String[] token = null;
      Scanner in = null;
      
      // check command line arguments
      if(args.length != 1){
         System.err.println("Usage: WC file");
         System.exit(1);
      }
      
      // get whole file as a single string
      fileScanner = new Scanner(new File(args[0]));
      fileScanner.useDelimiter("\\Z");     // \\Z matches end of file
      fileContents = fileScanner.next();   // takes in whole file as String
      charCount = fileContents.length();
      fileScanner.close();

      // separate fileContents into array of lines
      lineArray = fileContents.split("\\n");
      lineCount = lineArray.length;

      // separate fileContents into array of words
      wordArray = fileContents.split("\\s+");
      wordCount = wordArray.length;

      System.out.println( " "+lineCount+" "+wordCount+" "+charCount+" "+args[0] );
      
   }
}