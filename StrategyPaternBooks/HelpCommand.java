package StrategyPaternBooks;

public class HelpCommand implements Commandable{

	private String sHelpCommands = "Command Help: 'Quit', 'Help', 'List', 'Sort:<Author|Title|Year|NoSort>'";
	
	public HelpCommand()
	{
		
	}

	@Override
	public void doCommand(MyBookLibrary MBL) {
		
		UserInterface.UserOutput(sHelpCommands); 
	}

	@Override
	public boolean matchCommand(String s) {

		
		return s.toUpperCase().equals("HELP"); //returns true for match and false for no match.
		
		
	}
	
}
