package creatNames;



public class enter extends letter{


	String []array={"hadiadem"};
	String [] array1;
	public String [] array2(String ss)
	{
		int n=array.length;
		String [] array1=new String[n+1];
		for(int i=0;i<array.length;i++)
		{
			array1[i]=array[i];
		}
		array1[n]=ss;
		return array1;
	}

	public String [] entered(String string)
	{

		int nbr=string.length();
		if (nbr==2)
		{

			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					if(i!=j)
					{

						String s1=Character.toString(string.charAt(i));
						String s2=Character.toString(string.charAt(j));
						String s=s1+s2;

							array=array2(s);

					}
		    	}
	    	}

		}//end if nbr=2  ************************************** end if nbr=2
		else if(nbr==3)
		{

			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					if(i!=j)
					{

						String s1=Character.toString(string.charAt(i));
						String s2=Character.toString(string.charAt(j));
						String s=s1+s2;

							array=array2(s);

					}
		    	}
	    	}
			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					for(int x=0;x<nbr;x++)
					{
						if(i!=j && i!=x && j!=x)
						{

							String s1=Character.toString(string.charAt(i));
							String s2=Character.toString(string.charAt(j));
							String s3=Character.toString(string.charAt(x));
							String s=s1+s2+s3;

								array=array2(s);

						}
					}
		    	}
	    	}

		}//end if nbr=3  ************************************** end if nbr=3
		else if(nbr==4)
		{

			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					if(i!=j)
					{

						String s1=Character.toString(string.charAt(i));
						String s2=Character.toString(string.charAt(j));
						String s=s1+s2;

							array=array2(s);

					}
		    	}
	    	}
			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					for(int x=0;x<nbr;x++)
					{
						if(i!=j && i!=x && j!=x)
						{

							String s1=Character.toString(string.charAt(i));
							String s2=Character.toString(string.charAt(j));
							String s3=Character.toString(string.charAt(x));
							String s=s1+s2+s3;

								array=array2(s);

						}
					}
		    	}
	    	}
			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					for(int x=0;x<nbr;x++)
					{
						for(int y=0;y<nbr;y++)
						{
							if(i!=j && i!=x && i!=y && j!=x && j!=y && x!=y)
							{

								String s1=Character.toString(string.charAt(i));
								String s2=Character.toString(string.charAt(j));
								String s3=Character.toString(string.charAt(x));
								String s4=Character.toString(string.charAt(y));
								String s=s1+s2+s3+s4;

									array=array2(s);

							}
						}
					}
		    	}
	    	}

		}//end if nbr=4  ************************************** end if nbr=4
		else if(nbr==5)
		{

			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					if(i!=j)
					{

						String s1=Character.toString(string.charAt(i));
						String s2=Character.toString(string.charAt(j));
						String s=s1+s2;

							array=array2(s);

					}
		    	}
	    	}
			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					for(int x=0;x<nbr;x++)
					{
						if(i!=j && i!=x && j!=x)
						{

							String s1=Character.toString(string.charAt(i));
							String s2=Character.toString(string.charAt(j));
							String s3=Character.toString(string.charAt(x));
							String s=s1+s2+s3;

								array=array2(s);

						}
					}
		    	}
	    	}
			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					for(int x=0;x<nbr;x++)
					{
						for(int y=0;y<nbr;y++)
						{
							if(i!=j && i!=x && i!=y && j!=x && j!=y && x!=y)
							{

								String s1=Character.toString(string.charAt(i));
								String s2=Character.toString(string.charAt(j));
								String s3=Character.toString(string.charAt(x));
								String s4=Character.toString(string.charAt(y));
								String s=s1+s2+s3+s4;

									array=array2(s);

							}
						}
					}
		    	}
	    	}
			for(int i=0;i<nbr;i++)
			{
				for(int j=0;j<nbr;j++)
				{
					for(int x=0;x<nbr;x++)
					{
						for(int y=0;y<nbr;y++)
						{
							for(int z=0;z<nbr;z++)
							{
								if(i!=j && i!=x && i!=y && i!=z && j!=x && j!=y && j!=z
										&& x!=y && x!=z && y!=z)
								{

									String s1=Character.toString(string.charAt(i));
									String s2=Character.toString(string.charAt(j));
									String s3=Character.toString(string.charAt(x));
									String s4=Character.toString(string.charAt(y));
									String s5=Character.toString(string.charAt(z));
									String s=s1+s2+s3+s4+s5;

										array=array2(s);

								}
							}
						}
					}
		    	}
	    	}

		}//end if nbr=5  ************************************** end if nbr=5
		for(int n=1;n<array.length;n++)
		{
			System.out.print(n+"  ");
			System.out.println(array[n]);
		}
		return array;
	}//end function entered
}
