//-----------------------------------------------------------------------------
// DictionaryTest.java
// Christopher S. Gradwohl
// cgradwoh
// pa3
// my test client for the Linked List implementation of the Dictionary ADT
//-----------------------------------------------------------------------------

public class DictionaryTest{

    public static void main(String[] args){
        Dictionary A = new Dictionary();

// EMPTY DICTIONARY TEST--------------------------------------------------------------
        // test isEmpty() on empty Dicionary
                System.out.println();
                System.out.println("*EMPTY DICTIONARY*");
                System.out.print("the Dictionary is empty (should be true): ");
                System.out.println(A.isEmpty());

        // test size() on empty Dicionary
                System.out.print("Dictionary Items(should be empty): ");
                System.out.println(A.size());

        // test lookup() on empty Dicionary should return null
                System.out.print("lookup abc1(should be null):");
                System.out.println(A.lookup("abc1"));

        // test delete()
        /*//on empty Dictionary should throw exception
                System.out.print("delete(abc1):");
                A.delete("abc1");*/

        // test makeEmpty on empty Dictionary
                A.makeEmpty();
                System.out.println("Dictionary State(should be empty): "+A);

// ONE ELEMENT TEST------------------------------------------------------------------
        // test insert
                System.out.println("*INSERTS 1 ELEMENT*");
                A.insert("abc", "1337");
                System.out.println(A);

        /*// test duplicate key exception
                A.insert("abc", "1111");*/

        // test isEmpty()
                System.out.print("the Dictionary is empty(should be false): ");
                System.out.println(A.isEmpty());

        // test size()
                System.out.print("Dictionary State(should have 1 items):  ");
                System.out.println(A.size());

        // test lookup()
                System.out.println("abc value: "+A.lookup("abc"));

        // test delete()
        /*// non existant key should throw exception and kill the program
                A.delete("dude");
                A.delete("broo");*/

        // test delete()
                System.out.println();
                System.out.println("*DELETES 1 ITEM*");
                A.delete("abc");// delete key that is first in the list

        // test lookup() after delete
                System.out.println("abc value(should be null): "+A.lookup("abc"));

        // test makeEmpty()
                A.makeEmpty();
                System.out.println();
                System.out.println("*MAKE DICTIONARY EMPTY*");
                System.out.println("Dictionary State(should be empty): "+A);

        // test isEmpty()
                System.out.print("the Dictionary is empty(should be true): ");
                System.out.println(A.isEmpty());

// test Exceptions

            /*// KeyNotFound
            // non existant key should throw exception and kill the program
            A.delete("dude");
            A.delete("broo");*/

// FULL DICTIONARY TEST--------------------------------------------------------------
        // test insert()
                System.out.println();
                System.out.println("*INSERTS 7 ELEMENTS*");
                A.insert("abc1", "300b");
                A.insert("abc2", "999c");
                A.insert("abc3", "200a");
                A.insert("abc4", "broo");
                A.insert("abc5", "$$$$");
                A.insert("abc6", "fooo");
                A.insert("abc7", "barr");
                System.out.println("Dictionary Items(should have 7 items):");
                System.out.println(A);

        /*// test insert()
        // duplicate key should throw exception and kill program
                A.insert("abc1", "1111");
                A.insert("abc4", "2222");
                A.insert("abc7", "3333");*/

        // test isEmpty()
                System.out.print("the Dictionary is empty(should be false): ");
                System.out.println(A.isEmpty());

        // test size()
                System.out.print("Dictionary State(should have 7 items):  ");
                System.out.println(A.size());

        // test lookup()
                System.out.println("abc1 value: "+A.lookup("abc1"));// lookup key that is first in the list
                System.out.println("abc4 value: "+A.lookup("abc4"));// lookup key that is in the middle of the list
                System.out.println("abc7 value: "+A.lookup("abc7"));// lookup key that is last in the list
                System.out.println("dude value(should be null): "+A.lookup("dude"));// lookup key that is not in the list should return null

        // test delete()
                System.out.println();
                A.delete("abc1");// delete key that is first in the list
                A.delete("abc5");// delete key that is in the middle of the list
                A.delete("abc7");// delete key that is last in the list
                System.out.println("*DELETES abc1 abc5 abc7*");
                System.out.println("Dictionary Items(should have 4 items): ");
                System.out.println(A);

        // test lookup() after delete
                System.out.println("abc1 value(should be null): "+A.lookup("abc1"));// lookup key that is first in the list
                System.out.println("abc4 value: "+A.lookup("abc4"));// lookup key that is in the middle of the list
                System.out.println("abc7 value(should be null): "+A.lookup("abc7"));// lookup key that is last in the list
                System.out.println("dude value(should be null): "+A.lookup("dude"));// lookup key that is not in the list should return null

        /*// test delete()
        // non existant key should throw exception and kill the program
                A.delete("dude");
                A.delete("broo");*/

        // test makeEmpty()
                A.makeEmpty();
                System.out.println();
                System.out.println("*MAKE DICTIONARY EMPTY*");
                System.out.println("Dictionary State(should be empty): "+A);

        // test isEmpty()
                System.out.print("the Dictionary is empty(should be true): ");
                System.out.println(A.isEmpty());

// test Exceptions
        /*// DuplicateKey
        // duplicate key should throw exception and kill program
        A.insert("abc1", "1111");
        A.insert("abc4", "2222");
        A.insert("abc7", "3333");*/

        /*// KeyNotFound
        // non existant key should throw exception and kill the program
        A.delete("dude");
        A.delete("broo");*/



    }
}
