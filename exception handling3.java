class ZeroArgsException extends Exception
	{
	}
	class TooManyArgsException extends IllegalArgumentException
	{
	}
	class ExactlyThreeArgsException extends TooManyArgsException
	{
	}
	class Check
	{
		public static void main(String arg[]) 
		{
			try
			{
				int n=arg.length;
				if(n==0)
				  throw new ZeroArgsException();
				if(n>5)
				  throw new TooManyArgsException();
				if(n==3)
				  throw new ExactlyThreeArgsException();
			}
			catch(Exception e)
			{
				
			}			
		}
	}
