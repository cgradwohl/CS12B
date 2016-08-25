//-----------------------------------------------------------------------------
// DuplicateKeyException.java
// Christopher S. Gradwohl
// cgradwoh
// pa3
// extends the java RuntimeException for the Dictionary ADT
//-----------------------------------------------------------------------------

public class DuplicateKeyException extends RuntimeException{
    public DuplicateKeyException(String msg){
        super(msg);
    }
}
