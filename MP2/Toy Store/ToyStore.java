//Name:
//Prog:
//Spec:

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		//getThatToy(loadToys());
	}

	/** Load toys takes a String such as "Clue Clue Clue Sorry Sorry" as a parameter
	*   It will parse this String into an array of Strings and then either:
	* 	a) Add that toy if it does not yet exist in the toyList or
	*	b) Increment the count for that toy by one
	*/
	public void loadToys( String toys )
	{
		toyList = new ArrayList();

		String[] toy = toys.split(" ");

		for(int i = 0; i < toy.length; i++)
		toyList.add(new Toy(toy[i]));
	}

	/** Searches toyList for a toy with the same name as the parameter nm
	*   @return the toy if found, otherwise null
	*/
	public Toy getThatToy( String nm )
	{
		for(int i = 0; i < toyList.size(); i++)
		{
			if(toyList.get(i).equals(nm))
				return toyList.get(i);
		}
		return null;
	}

	/** @return the name of the toy that occurs the most frequently in toyList */
	public String getMostFrequentToy()
	{
		/*int count = 0;
		String frequent = "";
		for(int i = 0; i < toyList.size(); i++)
		{
			if(i == 0)
				count = toyList.get(i).getCount();
			else if(count < toyList.get(i).getCount())
				count = toyList.get(i).getCount();
			else if(count > toyList.get(i).getCount() && i == toyList.size()-1)
				frequent = toyList.get(i).getName();
		}
		return frequent;*/
		int count = 0;
		int temp = 0;
		int temp1 = 0;
		for(int i = 0; i < toyList.size(); i++)
		{
			for(int j = 0; j < toyList.size(); j++)
				if(toyList.get(i) == toyList.get(j))
					temp++;
					temp1 = i;
		}
		return count;
	}

	public void sortToysByCount()
	{
	}

	public String toString()
	{
	   return "";
	}
}