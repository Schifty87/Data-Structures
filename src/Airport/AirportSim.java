package Airport;

import javax.swing.*;
/** Simulate airport landing and take off.
*/
public class AirportSim {
    // Data Fields
    /** Landing Queue. */
    private RunawayQueue landingQueue =
    new RunawayQueue("Landing");
    /** Queue of regular passengers. */
    private RunawayQueue takeoffQueue =
    new RunawayQueue("Take off");
    /** Total simulated time. */
    private int totalTime;
    /** Simulated clock. */
    private int clock = 0;
    /** Time that the agent will be done with the current passenger.*/
    private int timeDone;
    /** Flag for detailed report */
    private boolean showAll;
    
    /** Creates a new instance of AirportSim */
    public AirportSim() {
        showAll = true;
        this.totalTime = 120;
    }

    //Private Methods
    private void runSimulation() {
        for (clock = 0; clock < totalTime; clock+=5) {
        	if (Math.random() <= 0.5){
                    landingQueue.checkNewArrival(clock, showAll);
                }
        		else{
                    takeoffQueue.checkNewArrival(clock, showAll);
        		}                
            
            if (clock >= timeDone) {
                startServe();
            }
        }
    }

    private void startServe() {
        if (!landingQueue.isEmpty()){
            // Serve the next landing.
            timeDone = landingQueue.update(clock, showAll);
            System.out.println("!!!!This is the current landing queue ");
            landingQueue.printQueue();
        } else if (!takeoffQueue.isEmpty()) {
            // Serve the next take off.
            timeDone = takeoffQueue.update(clock, showAll);
            System.out.println("!!!!This is the current takeoff queue ");
            takeoffQueue.printQueue();
        }else if (showAll){
            System.out.println("Time is " + clock + " server is idle");
        }
    }    

    /** Method to show the statistics. */
    private void showStats() {
        System.out.println("\nThe number of take-offs completed was "
            + takeoffQueue.getNumServed());
        double averageWaitingTime =
            (double) takeoffQueue.getTotalWait()
            / (double) takeoffQueue.getNumServed();
        System.out.println(" with an average waiting time of "
            + averageWaitingTime);
        System.out.println("The number of landings completed was "
            + landingQueue.getNumServed());
        averageWaitingTime = (double) landingQueue.getTotalWait()
            / (double) landingQueue.getNumServed();
        System.out.println(" with an average waiting time of "
            + averageWaitingTime);
        System.out.println("Requests left at take-off queue: "
            + takeoffQueue.getSize());
        System.out.println("Requests left at landing queue: "
            + landingQueue.getSize());
    }

    /** Main method.
    @param args Not used
    */
    public static void main(String args[]) {
        AirportSim sim = new AirportSim();
        //sim.enterData();
        sim.runSimulation();
        sim.showStats();
        System.exit(0);
    }
}

