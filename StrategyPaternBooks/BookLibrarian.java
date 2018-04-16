package StrategyPaternBooks;

import java.util.ArrayList;

public class BookLibrarian {

/*
 * The BookLibrarian holds a list of  books.  
		In each case, the sorting method will be changed in the BookLibrarian class using the Strategy pattern.  This means that you will need to 
		have three classes,	one class for each type of sorting.  If the BookLibrarian class has no sorting method defined, then the BookLibrarian
		 object will print the book information	list in any order.
		
		 Books From: https://www.npr.org/2011/08/11/139085843/your-picks-top-100-science-fiction-fantasy-books 4/14/2018 9:01 AM.

 */
	public ArrayList<BookInformation> BookInfoList = new ArrayList<BookInformation>();
	
	public BookLibrarian()
	{
		InitializeLibrary();
	}
	
	private void InitializeLibrary()
	{
		BookInformation BI = new BookInformation();
		
		BI.Add("J.R.R. Tolkien", "The Lord Of The Rings", "Tolkien's seminal three-volume epic chronicles the War of the Ring, in which Frodo the hobbit and his companions set out to destroy the evil Ring of Power and restore peace to Middle-earth. The beloved trilogy still casts a long shadow, having established some of the most familiar and enduring tropes in fantasy literature.", 1954
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Douglas Adams", "The Hitchhiker's Guide to the Galaxy", "", 1979
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Orson Scott Card", "Ender's Game", "Young Andrew \"Ender\" Wiggin, bred to be a genius, is drafted to Battle School where he trains to lead the century-long fight against the alien Buggers.", 1985
		);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Frank Herbert", "Dune", "Follows the adventures of Paul Atreides, the son of a betrayed duke given up for dead on a treacherous desert planet and adopted by its fierce, nomadic people, who help him unravel his most unexpected destiny.", 1965
		);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("George R.R. Martin", "Game of Thrones Boxed Set", "As the Seven Kingdoms face a generation-long winter, the royal Stark family confronts the poisonous plots of the rival Lannisters, the emergence of the Neverborn demons, the arrival of barbarian hordes, and other threats.", 2011
				);
		BookInfoList.add(BI);		
		BI = new BookInformation();
		BI.Add("George Orwell", "1984", "Portrays life in a future time when a totalitarian government watches over all citizens and directs all activities.", 1949
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Ray Bradbury", "Fahrenheit 451", "In a far future world, television dominates, and books are outlawed. The totalitarian regime has ordered all books to be burned by \"firemen,\" whose job is to start the fires rather than stop them. But one fireman begins to see the value of the printed word.", 1953
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Isaac Asimov", "Foundation", "A band of psychologists, under the leadership of psychohistorian Hari Seldon, plant a colony to encourage art, science, and technology in the declining Galactic Empire and to preserve the accumulated knowledge of humankind.", 1951
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Aldous Huxley", "Brave New World", "Huxley's classic prophetic novel describes the socialized horrors of a futuristic utopia devoid of individual freedom.", 1932
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Neil Gaiman", "American Gods", "On the plane home to attend the funerals of his wife and best friend, Shadow, an ex-con, encounters an enigmatic stranger who seems to know a lot about him. When Shadow accepts the stranger's job offer, he finds himself plunged into a perilous game with the highest of stakes: the soul of America itself.", 2001
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("William Goldman", "The Princess Bride", "S. Morgenstern's Classic Tale of True Love and High Adventure. This tale of a handsome farm boy who, aided by a drunken swordsman and a gentle giant, rescues a beautiful princess named Buttercup comes with a slyly humorous, metafictional edge: Goldman claims to have merely abridged an earlier text by one \"S. Morgenstern\" (actually a pseudonym) and peppers his text with clever commentary.", 1973
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Robert Jordan", "Wheel of Time", "At 13 volumes and counting, this sweeping — some would say sprawling – richly imagined epic chronicles the struggle between servants of the Dark One and those of the champion of light known as the Dragon Reborn.", 1990
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("George Orwell", "Animal Farm", "Farm animals overthrow their human owners and set up their own deeply (and familiarly) flawed government. Orwell's mordant satire of totalitarianism is still a mainstay of ninth-grade reading lists.", 1945
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("William Gibson", "Neuromancer", "Gibson's groundbreaking debut novel follows Case, a burned-out computer whiz, who is asked to steal a security code that is locked in the most heavily guarded databank in the solar system. A seminal work in the genre that would come to be known as cyberpunk.", 1984
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Alan Moore and Dave Gibbons", "Watchmen", "As former members of a disbanded group of superheroes called the Crimebusters start turning up dead, the remaining members of the group try to discover the identity of the murderer before they, too, are killed. A graphic novel.", 1986
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Isaac Asimov", "I, Robot", "Isaac Asimov changed our perception of robots forever when he formulated the laws governing their behavior. In I, Robot, Asimov chronicles the development of the robot through a series of interlinked stories: from its primitive origins in the present to its ultimate perfection in the not-so-distant future — a future in which humanity itself may be rendered obsolete.", 1950
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Robert A. Heinlein", "Stranger in a Strange Land", "Valentine Michael Smith, born and raised on Mars, arrives on Earth stunning Western culture with his superhuman abilities.", 1961
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Patrick Rothfuss", "The Name of the Wind", "This suspenseful coming-of-age story folllows Kvothe as he recounts his transformation from a magically gifted young man into the most notorious wizard, musician, thief and assassin in his world.", 2007
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Kurt Vonnegut", "Slaughterhouse-five", "Billy Pilgrim returns home from World War II only to be kidnapped by aliens from the planet Tralfamadore, who teach him that time is an eternal present.", 1969
				);
		BookInfoList.add(BI);
		BI = new BookInformation();
		BI.Add("Mary Wollstonecraft Shelley", "Frankenstein", "Mary Shelley's chilling portrait of a scientist obsessed with creating life, whose eventual success comes at too great a cost, was among the first works of science fiction ever produced. Its potent allegorical power, compelling ethical and philosophical themes, and its sheer creepiness have ensured it remains one of the most enduring and influential as well.", 1818
				);
		BookInfoList.add(BI);
	}
}
