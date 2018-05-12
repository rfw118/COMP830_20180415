package ObserverPatternWorker;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkItemTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testWorkItem() {
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		
		assertEquals("0001", wkItem1.ID);
		assertEquals("I have a message.", wkItem1.getMessage());
		assertEquals(1, wkItem1.WorkerID);
		
		assertNotEquals("0002", wkItem1.ID);
		assertNotEquals("I don't have a message.", wkItem1.getMessage());
		assertNotEquals(2, wkItem1.WorkerID);
		
	}

	@Test
	final void testSetWorker() {
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		
		wkItem1.setWorker(2);
		
		assertEquals(2, wkItem1.WorkerID);
		assertNotEquals(1, wkItem1.WorkerID);
		
	}

	@Test
	final void testGetMessage() {
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		
		assertEquals("I have a message.", wkItem1.getMessage());

		assertNotEquals("I don't have a message.", wkItem1.getMessage());
		
	}

}
