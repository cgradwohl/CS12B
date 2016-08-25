//  Simulation.java
//  Christopher S. Gradwohl
//  cgradwoh
//  pa4
//  a very short description of what the program does

import java.io.*;
import java.util.Scanner;
public class Simulation {
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
    // returns a formatted int array from  formatted input file data
    // creates int array A which holds m jobs, arrivals times, duration time
    public static int[] inputArray(String s){
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
    // allocates String s into int array, gets value of m, n
        int[] N = inputArray(s);
        int m = N[0];
        int n = N[0] - 1;
    // read m jobs from input file
    // creates processor array of n processors
        Queue storageQueue = jobQueueBuilder(N, m);
        Queue backUpQueue = jobQueueBuilder(N, m);
        Queue[] processorArray = new Queue[m];
        processorArray[0] = storageQueue;
        for(int j = 1; j<=n; j++){
            processorArray[j] = new Queue();
        }
        Job J = null;
        Job K = null;
        Job L = null;


        // *********************************************************************************
        //  Initialize processor Array with processorQueues by dequeueing from storageQueue
        // *********************************************************************************


        for (int i = 1; i <= n; i++){
            int timeNow = 0;
        //  print header of trace file
            if(i==1){
                trace.println("*****************************");
                trace.println(i+" processor:");
                trace.println("*****************************");
                trace.println("time = "+timeNow);

            }
            if(i>1){
                trace.println("*****************************");
                trace.println(i+" processors:");
                trace.println("*****************************");
                trace.println("time = "+timeNow);
            }
            trace.println("0: "+storageQueue);
            for(int b = 1; b <= i; b++){
                trace.println(b+": ");
            }
            trace.println();
            // if processor arrray is empty
            for (int a = 1; a <= i; a++){
                if (processorArray[a].isEmpty()) {
                    J = (Job)storageQueue.peek();
                    timeNow = J.getArrival();

                    J = (Job)storageQueue.dequeue();
                    int length1 = processorArray[a].length();
                    int length2 = processorArray[i].length();

                    processorArray[a].enqueue(J);
                    J.computeFinishTime(timeNow);


                    trace.println("time="+timeNow);
                    trace.println("0: "+storageQueue);
                    for(int b = 1; b <= i; b++){
                        if (!processorArray[b].isEmpty()) {
                            if(processorArray[b].length() == 1){
                                trace.println(b+": "+processorArray[b].peek());
                            }else{
                                trace.println(b+": "+processorArray[b]);
                            }
                        }else {
                            trace.println(b+": ");
                        }
                    }
                    trace.println();
                }
            }
            for(int t = 1; t <= m+1; t++) {
                // if processor array is NOT empty
                for (int a = 1; a <= i; a++){
                    if (!processorArray[a].isEmpty()){
                        if(!storageQueue.isEmpty()){
                            J = (Job)storageQueue.peek();
                            K = (Job)processorArray[a].peek();
                        }
                        //check if storageQueue.peek() has been processed
                        L = (Job)storageQueue.peek();
                        int l = L.getFinish();
                        if (l > 0){
                            K = (Job)processorArray[a].peek();
                            int k = K.getFinish();
                            timeNow = k;

                            K = (Job)processorArray[a].dequeue();
                            storageQueue.enqueue(K);

                            J = (Job)processorArray[a].peek();
                            J.computeFinishTime(timeNow);

                            trace.println("time="+timeNow);
                            trace.println("0: "+storageQueue);
                            for(int b = 1; b <= i; b++){
                                if (!processorArray[b].isEmpty()) {
                                    trace.println(b+": "+processorArray[b]);
                                }else {
                                    trace.println(b+": ");
                                }
                            }
                            trace.println();



                        }


                        int j = J.getArrival();
                        int k = K.getFinish();

                        if(j < k){
                            timeNow = j;
                            if(!storageQueue.isEmpty()){
                                J = (Job)storageQueue.dequeue();
                                if(processorArray[a].length() == 0){
                                    J.computeFinishTime(k);
                                }
                                processorArray[a].enqueue(J);
                            }
                            //processorArray[a].enqueue(J);

                            trace.println("time="+timeNow);
                            trace.println("0: "+storageQueue);
                            for(int b = 1; b <= i; b++){
                                if (!processorArray[b].isEmpty()) {
                                    trace.println(b+": "+processorArray[b]);
                                }else {
                                    trace.println(b+": ");
                                }
                            }
                        }


                        if(j > k){
                            timeNow = k;
                            K = (Job)processorArray[a].dequeue();
                            storageQueue.enqueue(K);
                            if (!processorArray[a].isEmpty()){
                                J = (Job)processorArray[a].peek();
                                J.computeFinishTime(timeNow);
                            }
                            trace.println("time="+timeNow);
                            trace.println("0: "+storageQueue);
                            for(int b = 1; b <= i; b++){
                                if (!processorArray[b].isEmpty()) {
                                    trace.println(b+": "+processorArray[b].peek());
                                }else {
                                    trace.println(b+": ");
                                }
                            }
                        }
                        trace.println();
                    }
                }
            }
            if(!processorArray[i].isEmpty())processorArray[i].dequeueAll();
            storageQueue = backUpQueue;

            report.println("Report file: "+args[0]+".rpt");
            report.println(m+" Jobs: ");
            report.println(backUpQueue);
            if(i==1){
                report.println(i + " processor: totalWait=  , maxWait=  , averageWait=  ");
            }else{
                report.println(i + " processors: totalWait=  , maxWait=  , averageWait=  ");
            }

        }





        report.close();
        trace.close();

    }

}
