package ObserverPatternWorker;

public class Worker {

	/*
	 * Each Worker will have the following data members: WorkerID (long).  Other data members may be added as you see fit.  These object will have methods as you see fit.
	 * 
	 * The behavior of the Worker objects is as follows:  Each Worker has a unique ID, 1-4.  When a Worker receives a WorkItem whose WorkerID matches the Worker object’s ID, then
	 the Worker will do the following:
	
	 - print out “Worker <WorkerID> processed WorkItem < WorkItem ID>”
	 -increment the WorkerID in the WorkItem 
	 - return the WorkItem object back to the WorkManager.  
	 
	Otherwise, the Worker will return a null.
	 */
	private long WorkerID;
	//private WorkItem myWork;
	
	
	public Worker(int ID, WorkManager WorkManager)
	{
		WorkerID = ID;
		WorkManager.Subscribe(this);
		
	}
	
	public WorkItem doWork(WorkItem wi)
	{
		UserInterface.UserOutput("Worker " + getWorkerID() + "processed WorkItem " + wi.ID );
		wi.WorkerID++;
		return wi;
	}
	
	public boolean matchID(WorkItem wi)
	{
		return WorkerID == wi.WorkerID;
	}
	
	public String getWorkerID()
	{
		return String.valueOf(WorkerID);
	}

	
	
}
