package StrategyPaternBooks;

import java.util.ArrayList;
import java.util.Collections;

public class ListByTitle implements ISortie {
	
	public ListByTitle()
	{
		
	}

	@Override
	public void SortForward(ArrayList<BookInformation> ALBI) {
		ArrayList<String> alsTitle = new ArrayList<String>();
		ArrayList<Integer> SortIndexes = new ArrayList<Integer>();
		int iPos = 0;
		
		for(BookInformation b:ALBI)
		{
			if(!alsTitle.contains(b.iYear))
			{
				alsTitle.add(b.iYear);
			}
			
		}
		
		Collections.sort(alsTitle);
		
			
		for(String s:alsTitle) //iterate the sorted array 
		{
			//UserInterface.UserOutput(s); //print each item.
			iPos = 0;
			
			for(BookInformation b:ALBI) //Look at all the book authors and add matching indexes in the Book List.
			{
				if(b.iYear == s)
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
		
	}

	@Override
	public void SortBackward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SortNone() {
		// TODO Auto-generated method stub
		
	}


}
