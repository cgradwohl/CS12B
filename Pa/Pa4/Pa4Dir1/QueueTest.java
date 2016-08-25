// QueueTest.java
// Christopher S. Gradwohl
// cgradwoh
// pa4
// a very short description of what the program does

public class QueueTest {

    public static void main(String[] args) {
        /*// Case 1 : the empty state and 1 element queue
        System.out.println("Test 1 Test 1 Test 1 Test 1 Test 1 ");
        Queue A = new Queue();
        Job job1 = new Job(1,1);
        // test isEmpty() on empty queue
        System.out.println("test isEmpty() (should be true): "+A.isEmpty());
        // test length() on empty queue
        System.out.println("test length() (should be 0): "+A.length());

        // test enqueue()
        A.enqueue(job1);
        // test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 1): "+A.length());

        // test peek()
        System.out.println("test peek() (should rtrn job 1): "+A.peek());
        // test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 1): "+A.length());*/

        /*// test dequeue() MUST BE DONE SEPERATE
        System.out.println("test dequeue() (should rtrn job 1): "+A.dequeue());
        // test isEmpty()
        System.out.println("test isEmpty() (should be true): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 0): "+A.length());*/

        /*// test dequeueAll() MUST BE DONE SEPERATE
        A.dequeueAll();
        System.out.println("test dequeueAll()");
        // test isEmpty()
        System.out.println("test isEmpty() (should be true): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 0): "+A.length());*/

        /*// throw Exceptions
        // dequeue()
        A.dequeue();
        // peek()
        A.peek();
        // dequeueAll()
        A.dequeueAll();*/



        /*// Case 2 : 2 element queue
        System.out.println("TEST 2 TEST 2 TEST 2 TEST 2 TEST 2 TEST 2 ");
        Queue A = new Queue();
        Job job1 = new Job(1,1);
        Job job2 = new Job(2,2);
        // test isEmpty() on empty queue
        System.out.println("test isEmpty() (should be true): "+A.isEmpty());
        // test length() on empty queue
        System.out.println("test length() (should be 0): "+A.length());

        // test enqueue()
        A.enqueue(job1);
        A.enqueue(job2);
        // test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 2): "+A.length());

        // test peek()
        System.out.println("test peek() (should rtrn job 1): "+A.peek());
        // test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 2): "+A.length());*/

        /*// test dequeue() MUST BE DONE SEPERATE
        System.out.println("test dequeue() (should rtrn job 1): "+A.dequeue());
        // test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 1): "+A.length());*/

        /*// test dequeueAll() MUST BE DONE SEPERATE
        A.dequeueAll();
        // test isEmpty()
        System.out.println("test isEmpty() (should be true): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 0): "+A.length());*/

        /*// throw Exceptions
        // dequeue()
        A.dequeue();
        A.dequeue();
        A.dequeue();
        // peek()
        A.peek();
        // dequeueAll()
        A.dequeueAll();
        A.dequeueAll();*/



        // Case 3 : multi element queue
        System.out.println("Test 3 Test 3 Test 3 Test 3 Test 3 Test 3 ");
        Queue A = new Queue();
        Job job1 = new Job(1,1);
        Job job2 = new Job(2,2);
        Job job3 = new Job(3,3);
        // test isEmpty() on empty queue
        System.out.println("test isEmpty() (should be true): "+A.isEmpty());
        // test length() on empty queue
        System.out.println("test length() (should be 0): "+A.length());

        // test enqueue()
        A.enqueue(job1);
        A.enqueue(job2);
        A.enqueue(job3);

        System.out.println(A);
        Job J = (Job)A.peek();
        System.out.println(J);

        /*// test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 3): "+A.length());

        // test peek()
        System.out.println("test peek() (should rtrn job 1): "+A.peek());
        // test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 3): "+A.length());*/

        /*// test dequeue() MUST BE DONE SEPERATE
        System.out.println("test dequeue() (should rtrn job 1): "+A.dequeue());
        //System.out.println("test dequeue() (should rtrn job 2): "+A.dequeue());
        //System.out.println("test dequeue() (should rtrn job 3): "+A.dequeue());
        // test isEmpty()
        System.out.println("test isEmpty() (should be false): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 2): "+A.length());*/

        /*// test dequeueAll() MUST BE DONE SEPERATE
        A.dequeueAll();
        System.out.println("test dequeueAll()");
        // test isEmpty()
        System.out.println("test isEmpty() (should be true): "+A.isEmpty());
        // test length()
        System.out.println("test length() (should be 0): "+A.length());*/

        /*// throw Exceptions
        // dequeue()
        A.dequeue();
        // peek()
        A.peek();
        // dequeueAll()
        A.dequeueAll();*/

    }
}
