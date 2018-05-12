package StrategyPaternBooks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListByAuthorTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	final void testSortForward() {
		ListByAuthor LBA = new ListByAuthor();
		ArrayList<BookInformation> ALBI = new ArrayList<BookInformation>();
		StrategyPaternBooks.BookInformation Book1 = new BookInformation();
		StrategyPaternBooks.BookInformation Book2 = new BookInformation();
		
		
		Book2.Add("AAA", "AAAA", "Book1 very nice", 2018);
		Book1.Add("BBB", "BBBB", "Book2 very nice", 2017);
		
		ALBI.add(Book1);
		ALBI.add(Book2);
		
		
		LBA.SortForward(ALBI);
		
		assertTrue(ALBI.get(0).sAuthor.compareTo(ALBI.get(1).sAuthor) >= 0);
		
		assertFalse(ALBI.get(0).sAuthor.compareTo(ALBI.get(1).sAuthor) <= 0);	
		
	}
	
	@Test
	final void testSortBackward()
	{
		//This method doesn't do anything.  Nothing to test.
	}

	@Test
	final void testSortNone()
	{
		//This method doesn't do anything.  Nothing to test.
	}
}
