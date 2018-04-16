package ObserverPatternWorker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testDoWork() {
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		WorkManager manager = new WorkManager();
		Worker w = new Worker(1, manager);
		
		w.doWork(wkItem1);
		if(wkItem1.WorkerID == 1)
		{
			fail("Worker ID should have incremented by 1");
		}
		
		if(wkItem1.WorkerID != 2)
		{
			fail("Worker ID should be 2");
		}
		
		
	}

	@Test
	final void testMatchID() {
		
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		WorkItem wkItem2 = new WorkItem("0002", "I have a message.", 2);
		WorkManager manager = new WorkManager();
		Worker w = new Worker(1, manager);
		
		if(w.matchID(wkItem1) == false)
		{
			fail("WorkItem should have matched worker!");
		}
		
		if(w.matchID(wkItem2) == true)
		{
			fail("Should not have mattched work item 2");
		}
		
		
		
		
	}


}
