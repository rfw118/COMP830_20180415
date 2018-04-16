package ObserverPatternWorker;

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
		
		if(wkItem1.ID != "0001")
		{
			fail("wrong ID");
		}
		if(wkItem1.getMessage().compareTo("I have a message.") != 0)
		{
			fail("Wrong message");
		}
		if(wkItem1.WorkerID != 1)
		{
			fail("wrong worker id");
		}
	}

	@Test
	final void testSetWorker() {
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		
		wkItem1.setWorker(2);
		
		if(wkItem1.WorkerID != 2)
		{
			fail("did not set worker id");
		}
	}

	@Test
	final void testGetMessage() {
		WorkItem wkItem1 = new WorkItem("0001", "I have a message.", 1);
		
		if(wkItem1.getMessage().compareTo("I have a message.") != 0)
		{
			fail("Wrong message");
		}
	}

}
