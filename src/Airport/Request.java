package Airport;

import java.util.Random;

/** A class to represent a request. */
public class Request {
    // Data Fields
    /** The ID number for this request. */
    private int requestId;
    
    /** The time needed to process this request. */
    private int processingTime;
    
    /** The time this request arrives. */
    private int arrivalTime;
    
    /** The sequence number for passengers. */
    private static int idNum = 0;
    
    /** Create a new request
      @param arrivalTime The time this request arrives */
    public Request(int arrivalTime, int procTime) {
        this.arrivalTime = arrivalTime;
        this.processingTime = procTime;
        requestId = idNum++;
    }
    
   /** Get the arrival time.
     @return The arrival time */
    public int getArrivalTime() {
        return arrivalTime;
    }
    
    /** Get the processing time.
      @return The processing time */
    public int getProcessingTime() {
        return processingTime;
    }
    
    /** Get the request ID.
      @return The request ID */
    public int getId() {
        return requestId;
    }
}

