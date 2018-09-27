package controller;

import model.SmashTournaments;
import javax.swing.JOptionPane;

public class IfController
{
	private SmashTournaments tournament;
	//public IfController()
	//{
	//	tournament = new SmashTournaments("kdjfkd", 2, 2, 2, 2.0, "kdjflskd", kdjfkj);
	//}
	public IfController()
	{
		tournament = new SmashTournaments();
	}
	public void start()
	{
		askUser();
		//String input = JOptionPane.showInputDialog(null, "What is the name of your smash tournament?");
		//String name = input;
	//	tournament.setname(input);
	}

	private void loopy()
	{
		
		
		
		//define a variable before the loop
		//boolean isFinished = false;
		//int someCount = 22;
		//
		//test the code
		//while (!isFinished);
		//{
			
		//	JOptionPane.showInputDialog(null, "ahdkhfkdjf");
		//	someCount -= 4;
		//	someCount--;
		//	
		//	if (someCount < 1)
		//	{
		//		isFinished = true;
		//	}
				
		
			
			
		String input = JOptionPane.showInputDialog(null, "What place did you take?");
		input = "1st";
		while(!validInt(input))
		{
			input = JOptionPane.showInputDialog(null, "I see.");
			Integer.parseInt(input);
		}
		tournament.setPlacement(Integer.parseInt(input));
		
		
		input = JOptionPane.showInputDialog(null, "How many entrants went to that tournament?");
		//int entrants = 1;
		while(!validInt(input))
		{
			input = JOptionPane.showInputDialog(null,"Type in a how many entrants showed up.");
			Integer.parseInt(input);
		}
		tournament.setEntrants(Integer.parseInt(input));
		
		input = JOptionPane.showInputDialog(null, "How much money was earned for the venue?");
		//double moneyEarned = 0;
		while(!validDouble(input))
		{
			input = JOptionPane.showInputDialog(null, "Enter a valid double, or decimal number.");
			Double.parseDouble(input);
		}
		tournament.setMoneyEarned(Double.parseDouble(input));
		
		
		
		
		for (int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "This is execution number" + index);
		}
		
		
		
		for (int what = 0; what < 30; what++)
		{
			JOptionPane.showMessageDialog(null, "This is number execution" + what);
		}
		
		
			//do code
		//	JOptionPane.showMessageDialog(null,  "annoy everyone!!!");
			
		//	someCount += 1;
		//	someCount++;
			//Update the test variable
		//	if (someCount > 10)
		//	{
		//						isFinished = true;
		//	}
		}
	
	
	
	
	
	
	private void askUser()
	{
		loopy();
		
	}
	
	
	
	
	
	
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		return isValid;
	}

	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle");
		}
		return isValid;
	}
}
