package Airport;

/*
 * runawayQueue.java
 *
 * Created on July 24, 2004, 8:54 PM
 */

/**
 *
 * @author  Cristina Abad
 */

/** Class to simulate a queue of requests. */
public class RunawayQueue extends Queue {
    // Data Fields
    /** The number of requests served. */
    private int numServed;
    /** The total time planes were waiting. */
    private int totalWait;
    /** The name of this queue. */
    private String queueName;
    
    // Constructor
    /** Construct a RunawayQueue with the given name.
      @param queueName The name of this queue
    */
    public RunawayQueue(String queueName) {
        numServed = 0;
        totalWait = 0;
        this.queueName = queueName;
    }
    
    /** New arrival has occurred.
      @param clock The current simulated time
    */
    public void checkNewArrival(int clock, boolean showAll) {
        enQueue(new Request(clock, 15));
        if (showAll) {
            System.out.println("Time is "
            + clock + ": "
            + queueName
            + " arrival, new queue size is "
            + getSize());
        }
    }    
    
    /** Update statistics.
      @param clock The current simulated time
      @param showAll Flag to indicate whether to show detail
      @return Time passenger is done being served
    */
    public int update(int clock, boolean showAll) {
        Request nextRequest = (Request) deQueue();
        int timeStamp = nextRequest.getArrivalTime();
        int wait = clock - timeStamp;
        totalWait += wait;
        numServed++;
        if (showAll) {
            System.out.println("Time is " + clock
            + ": Serving "
            + queueName
            + " with time stamp "
            + timeStamp);
        }
        return clock + nextRequest.getProcessingTime();
    }
    
    public int getNumServed(){
        return numServed;
    }
    
    public int getTotalWait(){
        return totalWait;
    }
    
    
}


