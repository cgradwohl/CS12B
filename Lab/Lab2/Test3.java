public class Test3{

/*
    // Solution4: Reverse using Recursion Example
	public static String reverseRecursion(String s) {
	    if (s.length() <= 1) {
	        return s;
	    }
	    return reverseRecursion(s.substring(1, s.length())) + s.charAt(0);
	}
*/

    public static String stringReverse(String s, int n){
        if (n <= 1) {
            return s;
        }
        return stringReverse(s.substring(1, s.length()), n-1) + s.charAt(0);
    }

    public static void main(String[] args){
        String myString = "abcd";
        int size = myString.length();
        System.out.println(stringReverse(myString,size));
    }
}
