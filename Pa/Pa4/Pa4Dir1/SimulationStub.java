// Christopher S. Gradwohl
// SimulationStub.java
// cgradwoh
// pa4
// starting point and psuedo code for pa4

import java.io.*;
import java.util.Scanner;

public class SimulationStub {

//-----------------------------------------------------------------------------
//
// The following function may be of use in assembling the initial backup and/or
// storage queues.  You may use it as is, alter it as you see fit, or delete it
// altogether.
//
//-----------------------------------------------------------------------------

   public static Job getJob(Scanner in) {
      String[] s = in.nextLine().split(" ");
      int a = Integer.parseInt(s[0]);
      int d = Integer.parseInt(s[1]);
      return new Job(a, d);
   }

   // returns a queue of jobs
   public static Queue jobQueueBuilder(int[] inputArray, int m){
       int o = 1;
       int e = 2;
       Queue A = new Queue();
       for(int i=1; i<=m; i++){
           Job J = new Job(inputArray[o],inputArray[e]);
           A.enqueue(J);
           o = o + 2;
           e = e + 2;
       }
       return A;
   }

    public static int[] inputArray(String s){
        // returns a formatted int array from  formatted input file data
        // creates int array A which holds m jobs, arrivals times, duration time
        int m = Integer.parseInt(""+s.charAt(0));
        int[] A = new int[s.length()];
        int[] P = new int[(2*m)+1];
        A[0] = m;
        int j = 1;
        for(int i=2; i<=s.length(); i=i+4) {
            int arrival = Character.getNumericValue(s.charAt(i));
            A[j] = arrival;
            j=j+2;
        }
        int k=2;
        for(int i=4; i<=s.length(); i=i+4){
            int duration = Character.getNumericValue(s.charAt(i));
            A[k] = duration;
            k=k+2;
        }
        for(int i=0; i<=2*m; i++) {
            int temp = A[i];
            P[i] = temp;
        }
        return P;
    }
//-----------------------------------------------------------------------------
//
// The following stub for function main contains a possible algorithm for this
// project.  Follow it if you like.  Note that there are no instructions below
// which mention writing to either of the output files.  You must intersperse
// those commands as necessary.
//
//-----------------------------------------------------------------------------

    public static void main(String[] args) throws IOException{
    // check command line arguments
        if(args.length == 0) {
            System.err.println("Usage: % InputTest input_file");
            System.out.println();
        }

    // open files for reading and writing
        Scanner in = new Scanner(new File(args[0]));
        PrintWriter report = new PrintWriter(new FileWriter(args[0]+".rpt"));
        PrintWriter trace = new PrintWriter(new FileWriter(args[0]+".trc"));
    // allocates input file data into string s
        in.useDelimiter("\\Z");
        String s = in.next();
        in.close();

    // allocates input file data into int array, gets value of m, n
        int[] N = inputArray(s);
        int m = N[0];
        int proc = N[0] - 1;

        // A is a queue of job object that was read from the input file
        // read m jobs from input file
        // creates processor array of n processors
        Queue storageQueue = jobQueueBuilder(N, m);
        Queue backUpQueue = storageQueue;
        Queue[] processorArray = new Queue[m+1];
        processorArray[0] = storageQueue;
        for(int j = 1; j<=proc; j++){
            processorArray[j] = new Queue();
        }



// ******************************************************************************************************
// ******************************************************************************************************
// ******************************************************************************************************
// ******************************************************************************************************
// ******************************************************************************************************


        int timeNow = 0;
        Job J = null;
        // this fills up 1 - n processorQueues by dequeueing from storage queue
        for (int n = 1; n < m; n++){
            int totalWait = 0;
            int maxWait = 0;
            double averageWait = 0.00;
            // reset after each simulation
            /*for(int i = 1; i<backUpQueue.length()+1; i++){
                J = (Job)backUpQueue.dequeue();
                J.resetFinishTime();
                storageQueue.enqueue(J);
                backUpQueue.enqueue(J);
            }*/
            int processors = n;
            Queue finished = processorArray[n+1];

            System.out.println("******************************");//Print for each run of the main loop
            if(processors==1){
                System.out.println(processors+" processor:");
            }else{
                System.out.println(processors+" processors:");
            }
            System.out.println("******************************");

            System.out.println("time="+timeNow);
            System.out.println("0: "+storageQueue);
            for(int i = 1; i < processors+1; i++){
                System.out.println(i+": "+processorArray[i]);
            }

            while(finished.length()!=m){






            }
        }
    }
}
