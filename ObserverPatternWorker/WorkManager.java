package ObserverPatternWorker;

import java.util.ArrayList;

public class WorkManager {

	/*
	 * 	The behavior of the WorkManager is as follows:  
	 * 	When it receives a WorkItem, it will notify all the Worker objects of the WorkItem.  
	 * 
	 * When the WorkManager gets a WorkItem back from a Worker that has a Worker ID in the range of 1 through 4, it will again notify all the Workers of the WorkItem.  
	 * When a WorkItem is received that has a WorkerID outside of the range 1 through 4, then WorkManager will print out “Work completed on WorkItem <WorkItem ID>”.  
	 * The WorkManager will now be ready for a new WorkItem to sent sent to it.
	 */
	ArrayList<Worker> Workforce = new ArrayList<Worker>();
	private Integer WorkerCount = 0;
	
	public WorkManager()
	{
		
		
	}
	
	private void NotifyWorkToDo(WorkItem wi)
	{
		if(wi.WorkerID <= 4)
		{
			for(Worker w:Workforce) //When WorkManager receives a WorkItem, it will notify all the Worker objects of the WorkItem.
			{
				if(w.matchID(wi)) //When the WorkManager gets a WorkItem back from a Worker that has a Worker ID in the range of 1 through 4, it will again notify all the Workers of the WorkItem.
				{
					NotifyWorkToDo(w.doWork(wi));
				}			
			}
		}
		else
		{
			UserInterface.UserOutput("Work completed on WorkItem " + wi.ID.toString());
		}
	}
	
	
	public void Subscribe(Worker w)
	{
		WorkerCount++;
		Workforce.add(w);
	}
	
	public void UnSubscribe(Worker w)
	{
		WorkerCount--;
		Workforce.remove(w);
		
	}
	
	public void AddWork(WorkItem wi)
	{
		NotifyWorkToDo(wi);
	}
	
	
}
