package ObserverPatternWorker;

public class WorkItem {

	/*
	 * A WorkItem object will have the following data members: ID(String), WorkerID (long), Message (String).  The WorkItem will have methods as you see fit.
	 */
	
	String ID;
	long WorkerID;
	String Message;
	
	public WorkItem(String JobID, String M, long WorkerNumber)
	{
		Message = M;
		ID = JobID;
		WorkerID = WorkerNumber;
	}
	
	public void setWorker(long l)
	{
		WorkerID = l;
	}
	
	public String getMessage()
	{
		return Message;
	}
	
	
}
