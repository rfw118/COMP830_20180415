package StrategyPaternBooks;

public class ListCommand implements Commandable {

	
	
	public ListCommand()
	{
		
	}
	
	
	@Override
	public void doCommand(MyBookLibrary MBL) {
		
		
		String s = MBL.getSort().toUpperCase();
		
		switch (s) {
		case  "AUTHOR":
			ListByAuthor lba = new ListByAuthor();
			lba.SortForward(MBL.BkLib.BookInfoList);
			break;
		case "TITLE":
			ListByTitle lbt = new ListByTitle();
			lbt.SortForward(MBL.BkLib.BookInfoList);
			break;
		case "YEAR":
			ListByYear lby = new ListByYear();
			lby.SortForward(MBL.BkLib.BookInfoList);
			break;
		default:
			for(BookInformation b:MBL.BkLib.BookInfoList)
			{
				UserInterface.UserOutput(b.print());
			}
			break;
		}
		

		


	}

	@Override
	public boolean matchCommand(String s) {

		return s.toUpperCase().equals("LIST"); //returns true for match and false for no match.
	}




}
