
/* Input a string,paragraph, count the occurence of a particular word in the string.
Print frequency of each word*/

import java.util.Scanner;
public class OccurCount
{
	public static void main(String args[])
	{
		String para,sub;
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the paragraph to be tested\n");
		para=sc.nextLine();
		
		String sa[]= para.split(" ");
		String dsa[]= new String[sa.length];
		int k=0;

		//Storing distinct words in the array
		for(int i=0;i<sa.length;i++)
		{
			int flag=0;
			for(int j=0;j<sa.length;j++)
			{
				if(sa[i].equals(dsa[j]))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				dsa[k]=sa[i];
				k++;
			}
			
		}
		//for(String retval:dsa)
			//System.out.println(retval);
		
		int count[]= new int[dsa.length];
		
		//counting frequency of each word in the paragraph
		//int x=1;
		for(int i=0;i<sa.length;i++)
		{
			count[i]=1;
		if(dsa[i]!=null)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(dsa[i].equals(sa[j]))
				{
					System.out.println("******");
					count[i]=count[i]+1;
				}	
			}	
		}
		}
		//printing frequency of each word
		for(int i=0;i<sa.length;i++)
		{
			if(dsa[i]!=null)
			System.out.println(dsa[i]+" "+count[i]);
		}
	}
}

					
					
	
