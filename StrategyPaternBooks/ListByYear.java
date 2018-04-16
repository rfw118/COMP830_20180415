package StrategyPaternBooks;

import java.util.ArrayList;
import java.util.Collections;

public class ListByYear implements ISortie{

	@Override
	public void SortForward(ArrayList<BookInformation> ALBI) {
		ArrayList<Integer> alsYear = new ArrayList<Integer>();
		ArrayList<Integer> SortIndexes = new ArrayList<Integer>();
		int iPos = 0;
		
		for(BookInformation b:ALBI)
		{
			if(!alsYear.contains(b.iYear))
			{
				alsYear.add(b.getYear());
			}
			
		}
		
		Collections.sort(alsYear);
		
			
		for(Integer s:alsYear) //iterate the sorted array 
		{
			//UserInterface.UserOutput(s); //print each item.
			iPos = 0;
			
			for(BookInformation b:ALBI) //Look at all the book authors and add matching indexes in the Book List.
			{
				if(b.getYear() == s)
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
