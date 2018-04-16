package ObserverPatternWorker;

import java.util.Scanner;

import StrategyPaternBooks.UserInterface;

public class MyWorkManager {

/*
 * 	Observer Instructions:
	You will be using the Observer pattern to broadcast a number of messages out to a number of listening objects.
	 
	A WorkManager is managing a set or Workers.  Each Worker object will be notified when a new WorkItem comes in.  There will be one WorkManager object, and 4 Worker objects.
	  WorkItems will be created as necessary.
	 
	 - A WorkItem object will have the following data members: ID(String), WorkerID (long), Message (String).  The WorkItem will have methods as you see fit.
	 - Each Worker will have the following data members: WorkerID (long).  Other data members may be added as you see fit.  These object will have methods as you see fit.
	 - Design the WorkManager as you see fit.
	 
	The behavior of the WorkManager is as follows:  When it receives a WorkItem, it will notify all the Worker objects of the WorkItem.  When the WorkManager gets a WorkItem
	 back from a Worker that has a Worker ID in the range of 1 through 4, it will again notify all the Workers of the WorkItem.  When a WorkItem is received that has a WorkerID
	  outside of the range 1 through 4, then WorkManager will print out “Work completed on WorkItem <WorkItem ID>”.  The WorkManager will now be ready for a new WorkItem to
	   sent sent to it.
	 
	The behavior of the Worker objects is as follows:  Each Worker has a unique ID, 1-4.  When a Worker receives a WorkItem whose WorkerID matches the Worker object’s ID, then
	 the Worker will do the following:
	
	 - print out “Worker <WorkerID> processed WorkItem < WorkItem ID>”
	 -increment the WorkerID in the WorkItem 
	 - return the WorkItem object back to the WorkManager.  
	 
	Otherwise, the Worker will return a null.
	 
	Write a program that satisfies the above requirements and uses the Observer pattern to send WorkItem objects from the WorkManager to the Workers.  The program will generate
	 4 WorkItems to send to the WorkManager, each with a unique WorkItem ID, and have a different WorkerID.
	 
	Use Junit and Mockito to write unit tests for two classes.  All unit tests must pass.

 */
	private String sUserInput = "";
	
	public static void main(String[] args) {
		
		MyWorkManager MWM = new MyWorkManager();
		MWM.Run();
	}
	
	private void Run()
	{
		WorkManager Manager = new WorkManager();
		
		Worker Worker1 = new Worker(1, Manager);
		Worker Worker2 = new Worker(2, Manager);
		Worker Worker3 = new Worker(3, Manager);
		Worker Worker4 = new Worker(4, Manager);
		

		
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		WorkItem wkItem2 = new WorkItem("0002", "A message of peace.", 1);
		WorkItem wkItem3 = new WorkItem("0003", "The good people of Earth,", 1);
		WorkItem wkItem4 = new WorkItem("0004", "welcome you to visit in peace.", 1);
		
		
		Manager.AddWork(wkItem1);
		Manager.AddWork(wkItem2);
		Manager.AddWork(wkItem3);
		Manager.AddWork(wkItem4);
		
		Scanner inputScanner = new Scanner(System.in);
		sUserInput = inputScanner.next();
		UserInterface.UserOutput("The End!");
		inputScanner.close();
		
	}
	


}
