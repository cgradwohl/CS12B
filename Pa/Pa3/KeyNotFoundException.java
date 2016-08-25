//-----------------------------------------------------------------------------
// KeyNotFoundException.java
// Christopher S. Gradwohl
// cgradwoh
// pa3
// extends the java RuntimeException for the Dictionary ADT 
//-----------------------------------------------------------------------------

public class KeyNotFoundException extends RuntimeException{
    public KeyNotFoundException (String msg) {
        super(msg);
    }
}
