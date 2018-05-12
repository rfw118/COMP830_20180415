package ObserverPatternWorker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
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
	final void testDoWork()
	{
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		WorkManager manager = new WorkManager();
		Worker w = new Worker(1, manager);
		Worker w2 = new Worker(2, manager);
		
		//Assert.assertTrue(message, condition); assertTrue()
		
		
		assertEquals("1", w.getWorkerID());
		System.out.println(w.getWorkerID().toString());
		
		assertNotEquals("2", w.getWorkerID());
		
		assertEquals(wkItem1, w.doWork(wkItem1));
		
		assertNotEquals("1", w2.getWorkerID());
		assertEquals("2", w2.getWorkerID());
		
	}
	
	@Test
	final void testMatchID() {
		
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		WorkItem wkItem2 = new WorkItem("0002", "I have a message.", 2);
		WorkManager manager = new WorkManager();
		Worker w = new Worker(1, manager);
		
		assertTrue(w.matchID(wkItem1));
		
		assertFalse(w.matchID(wkItem2));
		
		assertEquals(wkItem1, w.doWork(wkItem1));
		
		assertFalse(w.matchID(wkItem1));
		
		
		
	}
	
	@Test
	final void testGetWorkerID() {
		
		
		WorkManager manager = new WorkManager();
		Worker w = new Worker(1, manager);
		Worker w2 = new Worker(2, manager);
		
		assertEquals("1", w.getWorkerID());
		
		assertNotEquals("2", w.getWorkerID());
		
	}
}
