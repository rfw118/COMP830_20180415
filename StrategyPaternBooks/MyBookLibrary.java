package StrategyPaternBooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookLibrary {
/*
  Strategy Instructions:
	Use the strategy pattern to sort a list of BookInformation objects.  The BookLibrarian object holds a list of BookInformation objects,
	 and will use a number of different SortBook object to put the BookInformation objects into order.
	 
	The BookInformation class has the following data members:  Author, Title, YearPublished, and Summary.  Other data members and all methods are up to you.
	 
	The BookLibrarian holds a list of  books.  
		In each case, the sorting method will be changed in the BookLibrarian class using the Strategy pattern.  This means that you will need to have three classes, 
		one class for each type of sorting.  If the BookLibrarian class has no sorting method defined, then the BookLibrarian object will print the book information 
		list in any order.
	
	You will provide a list of 20 books, real or fictional. 
	 
	Your program will ask the user how the user wants the list of books sorted.  
	
		If the answer is by author, 
			then the program will print the list of books that is alphabetical by author.  
		If the answer is by title, 
			then the program will print the list of books that is alphabetical by title.  
		If the answer is by year, 
			then the program will print the list of books in order of the year of publication, oldest to newest.
	 
	Use JUnit and Mockito to write unit tests for two classes.  All tests must pass.
	
	Books From: https://www.npr.org/2011/08/11/139085843/your-picks-top-100-science-fiction-fantasy-books 4/14/2018 9:01 AM.

 */
	public HelpCommand HelpMe = new HelpCommand();
	public QuitCommand QuitMe = new QuitCommand();
	public ListCommand ListMe = new ListCommand();
	public SortCommand SortMe = new SortCommand();
	public List<Commandable> UserCommands = new ArrayList<Commandable>();
	public BookLibrarian BkLib = new BookLibrarian();
	private Boolean bolQuit = false;
	private String sSortOrder = "";
	private String sUserInput = "";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBookLibrary MBL = new MyBookLibrary();
		MBL.Run();
		
	}
	

	private void Run()
	{
		this.bolQuit = false;
		Scanner inputScanner = new Scanner(System.in);
		Subscribe(this.HelpMe);
		Subscribe(this.QuitMe);
		Subscribe(this.ListMe);
		Subscribe(this.SortMe);		
		
		UserInterface.UserOutput("Welcome!  This is the book library!");
		ProcessUserInputCommands("HELP");
		UserInterface.UserOutput("How would you like the list to be sorted?  <Author | Title | Year | NoSort>");
		
		while( bolQuit == false)
		{
			sUserInput = inputScanner.next();
			this.ProcessUserInputCommands(sUserInput);
				
		}
		UserInterface.UserOutput("The End!");
		inputScanner.close();

	}
	
	private void ProcessUserInputCommands(String UserInput)
	{
		boolean bolCommandExecuted = false;
		
		for(Commandable c:UserCommands)
		{
			bolCommandExecuted = c.matchCommand(UserInput);
			if(bolCommandExecuted)
			{
				c.doCommand(this);
				break;
			}
		}
		
		if(bolCommandExecuted == false)
			{
				UserInterface.UserOutput("Command not recognized");
			}
		
	}

	protected void QuitProgram()
	{
		this.bolQuit = true;
	}
	
	public void Subscribe(Commandable c)
	{
		UserCommands.add(c);
		
	}
	public void setSort(String s)
	{
		sSortOrder = s;
	}
	public String getSort()
	{
		return sSortOrder;
	}
	public String getUserInput()
	{
		return sUserInput;
	}
}
