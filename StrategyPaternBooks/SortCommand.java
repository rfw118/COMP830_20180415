package StrategyPaternBooks;

public class SortCommand implements Commandable {

	
	
	@Override
	public void doCommand(MyBookLibrary MLB) {
		
		String s = MLB.getUserInput().toUpperCase();
		
		switch (s) {
		case  "AUTHOR":
			MLB.setSort(s);
			break;
		case "TITLE":
			MLB.setSort(s);
			break;
		case "YEAR":
			MLB.setSort(s);
			break;
		case "NOSORT":
			MLB.setSort("");
			break;
		default:
			MLB.setSort("");
			break;
		}
		
		UserInterface.UserOutput("Sorting set to: " + MLB.getSort());
	}

	@Override
	public boolean matchCommand(String s) {
		
		
		switch (s.toUpperCase()) {
		case  "AUTHOR":
			return true;
		case "TITLE":
			return true;
		case "YEAR":
			return true;
		case "NOSORT":
			return true;
		default:
			return false;
		}
		//return s.toUpperCase().equals("SORT"); //returns true for match and false for no match.
	}

}
