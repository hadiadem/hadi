package creatNames;

public class letter {
	boolean b;
	public boolean boolvowels(String c)
	{
		
		if(c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i")
				|| c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u") )
		{b=true;}
		
	    return b;		
	}
	
	public boolean boolconsonant(String c)
	{		
		
		if(c.equalsIgnoreCase("b") ||c.equalsIgnoreCase("c") ||c.equalsIgnoreCase("d") 
	     ||c.equalsIgnoreCase("f") ||c.equalsIgnoreCase("j") ||c.equalsIgnoreCase("h") 
	     ||c.equalsIgnoreCase("g") ||c.equalsIgnoreCase("k") ||c.equalsIgnoreCase("l") 
	     ||c.equalsIgnoreCase("m") ||c.equalsIgnoreCase("n") ||c.equalsIgnoreCase("p") 
	     ||c.equalsIgnoreCase("q") ||c.equalsIgnoreCase("r") ||c.equalsIgnoreCase("s") 
	     ||c.equalsIgnoreCase("w") ||c.equalsIgnoreCase("y") ||c.equalsIgnoreCase("x") 
	     ||c.equalsIgnoreCase("z") ||c.equalsIgnoreCase("t"))
		{
			b=true;
		}
		
	    return b;		
	}
}
