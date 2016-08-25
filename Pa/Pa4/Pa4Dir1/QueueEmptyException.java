// QueueEmptyException.java
// Christopher S. Gradwohl
// cgradwoh
// pa4
// extends the java RuntimeException for the Queue ADT

public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException (String errmsg) {
        super(errmsg);
    }
}
