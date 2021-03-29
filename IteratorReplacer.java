//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
    String[] words = line.split(" ");   
    list = new ArrayList<String>(Arrays.asList(words));
    toRemove = rem;
    replaceWith = rep;
	}

	public void setEmAll(String line, String rem, String rep)
	{
    String[] words = line.split(" ");   
    list = new ArrayList<String>(Arrays.asList(words));
    toRemove = rem;
    replaceWith = rep;
	}

	public void replace()
	{
    ListIterator i = list.listIterator();
    while (i.hasNext())
    {
      if (i.next().equals(toRemove))
        i.set(replaceWith);
    }
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}
