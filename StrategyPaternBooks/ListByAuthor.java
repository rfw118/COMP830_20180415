package StrategyPaternBooks;

import java.util.ArrayList;
import java.util.Collections;

public class ListByAuthor implements ISortie {
	
	public ListByAuthor()
	{
		
	}

	//@Override
	public void SortForward(ArrayList<BookInformation> ALBI) {
		
		ArrayList<BookInformation> NewOrderList = new ArrayList<BookInformation>();
		ArrayList<String> alsAuthor = new ArrayList<String>();
		ArrayList<Integer> SortIndexes = new ArrayList<Integer>();
		int iPos = 0;
		
		for(BookInformation b:ALBI)
		{
			if(!alsAuthor.contains(b.sAuthor))
			{
				alsAuthor.add(b.sAuthor);
			}
			
		}
		
		Collections.sort(alsAuthor);
		
			
		for(String s:alsAuthor) //iterate the sorted array 
		{
			//UserInterface.UserOutput(s); //print each item.
			iPos = 0;
			
			for(BookInformation b:ALBI) //Look at all the book authors and add matching indexes in the Book List.
			{
				if(b.sAuthor == s)
				{
					SortIndexes.add(iPos);
					
				}
				iPos++;
			}
			
			
			
		}
		
		for(Integer i:SortIndexes)
		{
			UserInterface.UserOutput(ALBI.get(i).print());
		}
	
		/*
		for(BookInformation bi:ALBI) //iterate the Book List
		{
			if(bi.sAuthor.equals(s)) //Find the matching author
			{
				NewOrderList.add(bi); //add it to the new ordered list
				ALBI.remove(bi);	//remove it from the old list
			}
		}
		
		
		//may need to rebuild ALBI
		for(BookInformation b:NewOrderList)
		{
			UserInterface.UserOutput(b.print()); //print each item.
		}
		
		*/
		
		
	}

	//@Override
	public void SortBackward() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void SortNone() {
		// TODO Auto-generated method stub
		
	}


	


}
