package StrategyPaternBooks;

public interface Commandable {
	
	public void doCommand(MyBookLibrary MBL);
	
	public boolean matchCommand(String s);

	
}
