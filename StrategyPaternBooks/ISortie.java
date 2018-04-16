package StrategyPaternBooks;

import java.util.ArrayList;

public interface ISortie {
	
	public abstract void SortForward(ArrayList<BookInformation> ALBI);
	public abstract void SortBackward();
	public abstract void SortNone();

}
