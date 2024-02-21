package lesson11;

import java.lang.management.ManagementFactory;      // for accessing platform and JVM-related management interfaces.
import java.lang.management.ThreadMXBean;           // for monitoring thread-related metrics

public class ThreadMonitoring {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new SampleTask(), "Thread-" + i );
            threads[i].start();
        }

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        // Flag to control the loop
        boolean isMonitoring = true;
        long startTime = System.currentTimeMillis();

        while(isMonitoring){                                                  
        // starts an infinite loop for continuous monitoring of thread metrics.

            System.out.println("Thread Monitoring Metrics:");      
            // header indicating the start of thread monitoring metrics.

            for(Thread thread : threads){
                long threadId = thread.getId(); 
                System.out.println("Thread Name: " + thread.getName());
                System.out.println("Thread State: " + thread.getState());
                System.out.println("CPU Time (nanoseconds): " + threadMXBean.getThreadCpuTime(threadId));
                // CPU time consumed by the thread in nanoseconds.
                System.out.println("User Time (nanoseconds): " + threadMXBean.getThreadUserTime(threadId));
                // user time (time spent executing application code) consumed by the thread in nanoseconds.
                System.out.println("----------------------------");
            }
            try {
                Thread.sleep(5000);                 
                //main thread sleep for 5 seconds before the next monitoring iteration

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             // Check if a condition to stop monitoring is met
            // For example, after a certain time or when a specific event occurs
            // Here, we'll just stop after 30 seconds
            if(System.currentTimeMillis() - startTime > 30000) {
                isMonitoring = false;
            }
        }
    }

    static class SampleTask implements Runnable{

        @Override
        public void run() {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " is running...");
                //message indicating that the current thread is running.         

                try {
                    Thread.sleep(1000);
                    //makes the current thread sleep for 1000 milliseconds (1 second) during each iteration of the loop
                    //During this sleep time, the thread is in the TIMED_WAITING state

                } catch (InterruptedException e) {      
                    //block handles InterruptedException that might be thrown when the thread is interrupted while sleeping
                    e.printStackTrace();
                }
            }
        }
        
    }
}
