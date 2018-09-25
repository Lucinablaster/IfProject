package controller;

import model.SmashTournaments;
import javax.swing.JOptionPane;

public class IfController
{
	//private SmashTournaments tournament;

	//public IfController()
	//{
	//	tournament = new SmashTournaments("kdjfkd", 2, 2, 2, 2.0, "kdjflskd", kdjfkj);
	//}

	public void start()
	{
		loopy();
		//String input = JOptionPane.showInputDialog(null, "What is the name of your smash tournament?");
		//String name = input;
	//	tournament.setname(input);
	}

	private void loopy()
	{
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 22;
		
		//test the code
		while (!isFinished);
		{
			
			JOptionPane.showInputDialog(null, "ahdkhfkdjf");
			someCount -= 4;
			someCount--;
			
			if (someCount < 1)
			{
				isFinished = true;
			}
			
			
			
		
			
			
		String placement = JOptionPane.showInputDialog(null, "What place did you take?");
		placement = "yes";
		while(!validInt(placement))
		{
			Integer.parseInt(placement);
			placement = JOptionPane.showMessageDialog(null, "I see.");
		}
		SmashTournaments.setPlacement(Integer.parseInt(placement));
		
		
		for (int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "This is execution number" + index);
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
