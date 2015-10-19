/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package ex1;
import java.util.*;

// line 8 "../tutorialwhat1.ump"
public class Manager
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Manager theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Manager Attributes
  private int ID;

  //Manager Associations
  private List<Match> matchs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private Manager()
  {
    matchs = new ArrayList<Match>();
  }

  public static Manager getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new Manager();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setID(int aID)
  {
    boolean wasSet = false;
    ID = aID;
    wasSet = true;
    return wasSet;
  }

  public int getID()
  {
    return ID;
  }

  public Match getMatch(int index)
  {
    Match aMatch = matchs.get(index);
    return aMatch;
  }

  public List<Match> getMatchs()
  {
    List<Match> newMatchs = Collections.unmodifiableList(matchs);
    return newMatchs;
  }

  public int numberOfMatchs()
  {
    int number = matchs.size();
    return number;
  }

  public boolean hasMatchs()
  {
    boolean has = matchs.size() > 0;
    return has;
  }

  public int indexOfMatch(Match aMatch)
  {
    int index = matchs.indexOf(aMatch);
    return index;
  }

  public static int minimumNumberOfMatchs()
  {
    return 0;
  }

  public boolean addMatch(Match aMatch)
  {
    boolean wasAdded = false;
    if (matchs.contains(aMatch)) { return false; }
    matchs.add(aMatch);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMatch(Match aMatch)
  {
    boolean wasRemoved = false;
    if (matchs.contains(aMatch))
    {
      matchs.remove(aMatch);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addMatchAt(Match aMatch, int index)
  {  
    boolean wasAdded = false;
    if(addMatch(aMatch))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMatchs()) { index = numberOfMatchs() - 1; }
      matchs.remove(aMatch);
      matchs.add(index, aMatch);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMatchAt(Match aMatch, int index)
  {
    boolean wasAdded = false;
    if(matchs.contains(aMatch))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMatchs()) { index = numberOfMatchs() - 1; }
      matchs.remove(aMatch);
      matchs.add(index, aMatch);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMatchAt(aMatch, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    matchs.clear();
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "ID" + ":" + getID()+ "]"
     + outputString;
  }
}