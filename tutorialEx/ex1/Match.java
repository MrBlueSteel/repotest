/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/

package ex1;

// line 3 "../tutorialwhat1.ump"
public class Match
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Match Attributes
  private int ID;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Match(int aID)
  {
    ID = aID;
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

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "ID" + ":" + getID()+ "]"
     + outputString;
  }
}