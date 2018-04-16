package StrategyPaternBooks;

public class QuitCommand 
implements Commandable
{

	public QuitCommand() {
		
	
	}
	
	@Override
	public void doCommand(MyBookLibrary MBL) {
		MBL.QuitProgram();
		//UserInterface.UserOutput(CommandMessage());
	}
	
	@Override
	public boolean matchCommand(String s) {
		
		return s.toUpperCase().equals("QUIT");
		
		
	}
	/*
	private String CommandMessage()
	{
		
		return "I ran!";
	}
	*/
}
