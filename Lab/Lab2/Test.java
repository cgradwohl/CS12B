import java.lang.*;

public class Test {




/*
    public static String stringReverse(String s, int n) {
        if(n > 0) {
            System.out.print(s.substring(n-1,n));
            stringReverse(s, n-1);
        }
        return s;
    }



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
        String p;
        int z = 0;
        if(n > 0) {

            x = s.charAt(n-1);
            b[z] = x;
            stringReverse(s, n-1);
            z++;
        }
        return s = String.valueOf(b);

    }


    public static void main(String[] args) {
        String A = "abc";
        int a = A.length();
        String str = stringReverse(A,a);
        System.out.println(str);

        /*
        char[] b = new char [10];
        char x;
        String p;
        x = A.charAt(2);
        b[1] = x;
        p = String.valueOf(b);
        System.out.println(p);
        */
        //stringReverse(A,a);

        //char[] b = {'a','b','c'};
        //System.out.println(b[1]);

        //String B1 = new String(b);
        //System.out.println(B1);
        //String B2 = String.valueOf(b);
        //System.out.println(B2);

    }

}
