package StrategyPaternBooks;

public class BookInformation {
	 /*
	  * The BookInformation class has the following data members:  Author, Title, YearPublished, and Summary.  Other data members and all methods are up to you.
	 
	  */
	
	String sAuthor;
	String iYear;
	String sSummary;
	int iYearPublished;
	
	BookInformation()
	{
		InitializeVarables();

	}

	private void InitializeVarables()
	{
		sAuthor = "";
		iYear = "";
		sSummary = "";
		iYearPublished = 0;
	}
	
	public void Add(String Author, String Title, String Summary, int YearPublished)
	{
		sAuthor = Author;
		iYear = Title;
		sSummary = Summary;
		iYearPublished = YearPublished;
	}
	
	public String print()
	{
		return "Author: " + sAuthor + ", Title: " + iYear + ", Year Published: " + iYearPublished + ", Summary: " + sSummary;
	}
	
	public String getAuthor()
	{
		return sAuthor;
	}
	
	public String getTitle()
	{
		return iYear;
		
	}
	public int getYear()
	{
		return iYearPublished;
	}

}
