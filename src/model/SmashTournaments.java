package model;
/**
 * Default constructor for a tournament setting.
 * Initializes all variables to valid but "bad" values.
 * Used for later customization.	
 * 
 */

public class SmashTournaments
{
	private String name;
	private int entrants;
	private int ranking;
	private int setCount;
	private boolean setWon;
	private int placement;
	private double moneyEarned;
	
	
	/**
	 * Initializes a name instance with a value for the string.
	 * @param name - The name of the smash tournament
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEntrants(int entrants)
	{
		this.entrants = entrants;
	}
	
	public void setRanking(int ranking)
	{
		this.ranking = ranking;
	}
	
	public void setSetCount(int setCount)
	{
		this.setCount = setCount;
	}
	
	public void setSetWon(boolean setWon)
	{
		this.setWon = setWon;
	}
	
	public void setPlacement(int placement)
	{
		this.placement = placement;
	}
	
	public void setMoneyEarned(double moneyEarned)
	{
		this.moneyEarned = moneyEarned;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEntrants()
	{
		return entrants;
	}
	
	public int getRanking()
	{
		return ranking;
	}
	
	public int setCount()
	{
		return setCount;
	}
	
	public boolean getSetWon()
	{
		return setWon;
	}
	
	public int getPlacement()
	{
		return placement;
	}
	
	public double getMoneyEarned()
	{
		return moneyEarned;
	}
}
