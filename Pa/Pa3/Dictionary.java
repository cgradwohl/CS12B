//-----------------------------------------------------------------------------
// Dictionary.java
// Christopher S. Gradwohl
// cgradwoh
// pa3
// linked list implementation of the Dictionary ADT
//-----------------------------------------------------------------------------

public class Dictionary implements DictionaryInterface {

    // private inner Node class
    private class Node {
       String key;
       String value;
       Node next;
       Node(String x, String y){
          key = x;
          value = y;
          next = null;
       }
    }

    // private helper variables
    private Node head;
    private int numItems;

    // private inner helper method finKey()
    // returns a Reference Node to the Node whos key field equals the key parameter
    private Node findKey(String key){
        Node R = head;
        while (R != null){
            if (R.key.equals(key)) {
                return R;
            }
            R = R.next;
        }
        return null;
    }

    // constructor for the Dictionary class
    public Dictionary(){
       head = null;
       numItems = 0;
    }

//   ADT operations ----------------------------------------------------------

    // isEmpty()
    // pre: none
    // post: returns true if this IntgerList is empty, false otherwise
    public boolean isEmpty(){
       return(numItems == 0);
    }

    // size()
    // pre: none
    // post: returns the number of elements in this IntegerList
    public int size() {
       return numItems;
    }

    // lookup()
    // pre:
    // post:
    public String lookup(String key) {
        Node N = findKey(key);
        Node P = head;
        if(N == null) return null;
        while (P != N) P = P.next;
        return P.value;
    }

    /// insert()
    // inserts new (key,value) pair into this Dictionary
    // pre: lookup(key)==null
    public void insert(String key, String value) throws DuplicateKeyException {
        Node N = findKey(key);
        if (N != null){
            throw new DuplicateKeyException("Dictionary Error: cannot insert duplicate keys");
        }
        if (head == null){
            head = new Node(key, value);
        }else{
            Node P = head;
            while (P.next != null) P = P.next;
            P.next = new Node(key, value);
        }

        numItems++;
    }

    // delete()
    // deletes pair with the given key
    // pre: lookup(key)!=null
    public void delete(String key) throws KeyNotFoundException {
        Node N = findKey(key);
        if (N == null) {
            throw new KeyNotFoundException("cannot delete non-existent key");
        }
        Node P = head;
        Node C = P.next;
        if (P == N) {
            head = C;
            P = C;
        }
        else if (P != N) {
            while (C != N) {
                P = P.next;
                C = C.next;
            }
            P.next = C.next;
            if (C.next == null) P.next = null;
        }
        //P.next = C.next;
        //if (C.next == null) P.next = null;
        numItems--;
    }

    // makeEmpty()
    // pre: none
    // post: isEmpty()
    public void makeEmpty(){
       head = null;
       numItems = 0;
    }

    // toString()
    // pre: none
    // post:  prints current state to stdout
    // Overrides Object's toString() method
    public String toString(){
       StringBuffer sb = new StringBuffer();
       Node P = head;
       for( ; P!=null; P=P.next){
          sb.append(P.key).append(" ").append(P.value).append("\n");
       }
       return new String(sb);
    }
}
