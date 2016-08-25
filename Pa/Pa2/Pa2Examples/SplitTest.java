//-----------------------------------------------------------------------------
// SplitTest.java
//
// Illustrates use of String's split() method, along with some subtle points
// regarding the tokenization of Strings.
//
// If s1 and s2 are Strings, the expression s1.split(s2) returns a String array
// consisting of those maximal substrings of s1 (possibly empty) not containing
// s2 which are terminated either by an instance of s2 or by the end of the
// String s1. Trailing empty Strings are ommited from the array. The substring
// s2 is often referred to as the delimiter.
//
//-----------------------------------------------------------------------------

class SplitTest {

   public static void main(String[] args){
      
      // Here "z" is the delimiter.
      printArray( "aaazbbbzccc".split("z") ); // {"aaa","bbb","ccc"}

      // One delimiter at the beginning causes split() to include the empty
      // string "" between the beginning of the String and the first "z" since: 
      // (1) "" is a substring of "zaaazbbbzccc", (2) "" does not contain "z"
      // and (3) "" in that position is terminated by "z" on its right.
      printArray( "zaaazbbbzccc".split("z") ); // {"","aaa","bbb","ccc"}

      // Not so with a "z" at the end of the String even though the "" in that
      // position is terminated by the end of the String.  This is because 
      // trailing empty Strings are always omitted from the returned array.
      printArray( "aaazbbbzcccz".split("z") ); // {"aaa","bbb","ccc"}

      // Multiple consecutive instances of the delimiter "z" causes split()
      // to include more empty Strings in the array.  As always empty Strings
      // at the end of the array are excluded.
      printArray( "zzaaazzbbbzzccczz".split("z") ); // {"","","aaa","","bbb","","ccc"}

      // The delimiter may have more than one character in it.  Try to predict
      // the output of the next example.
      printArray( "zzaaazzbbbzzccczz".split("zz") );

      // In general the delimiter can be not just any individual String, but any
      // set of Strings. We can specify such a set by using something called a 
      // regular expression. For instance, the regular expression "[z]+" stands for 
      // the set of Strings consisting of one or more z's in a row: {"z","zz","zzz",....}. 
      printArray( "zaaazzbbbzzzzccczzzzzzz".split("[z]+") ); // {"","aaa","bbb","ccc"}

      // The regular expression "[ \\t\\n]+" stands for any substring consisting
      // of one or more whitespace characters (spaces, tabs, newlines).
      String str = "   aaa  \t bbb \t\n\t  ccc   \n\n  "; 
      printArray( str.split("[ \\t\\n]+") ); // {"","aaa","bbb","ccc"}

      // A shortend version of this last regular expression is "\\s+"
      printArray( str.split("\\s+") ); // {"","aaa","bbb","ccc"}


      // We often wish to tokenize a String by deleting all whitespace and keeping
      // what's left as the so-called tokens. The empty Strings that split() puts 
      // in the array are then awkward. To get rid of them we can use the trim() 
      // method belonging to String.  trim() returns a new String with any leading
      // and trailing white space deleted.
      printArray( str.trim().split("\\s+") ); // {"aaa","bbb","ccc"}

      // The only problem now is what split() does to the empty String itself.
      printArray( "".trim().split("\\s+") ); // { "" }

      // The empty String contains no characters, so it contains no tokens, so
      // tokenizing the empty String should result in an empty array.  The formula
      // above gives you a one element array containing the empty String.  We
      // can fix this by adding one more space character at the end of the String
      // after the trim().
      printArray( ("".trim()+" ").split("\\s+") ); // { }

      // The above formula gives us a correct tokenization whether or not str is 
      // the empty String.  It forms the basis of the function tokenize() below.
      printArray( tokenize(str) );
      printArray( tokenize("") );
   }

   // tokenize()
   // Returns a String array consisting of the tokens in s.
   static String[] tokenize(String s){
      return (s.trim()+" ").split("\\s+");
   }

   // printArray()
   // Prints a String array to stdout followed by its length
   static void printArray(String[] X){
      int k, n=X.length;

      System.out.print("{ ");
      for(k = 0; k<n-1; k++){
         System.out.print("\""+X[k]+"\", ");
      }
      if( n>0 ) System.out.print("\""+X[n-1]+"\" }");
      else      System.out.print("}");
      System.out.println(" length = "+n);
   }

}
