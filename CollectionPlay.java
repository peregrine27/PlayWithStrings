/*Enter 10 words and add the ASCII values of each word. The number which comes..take the first digit of that number(1-9)
suppose number is 11----> insert a list in that position 
RAM- 82+65+78= 224 
take 2. at that position insert a list and add that number to the list. Print the position of each.
ARRAY LIST within a LIST
*/

import java.io.*;
import java.util.*;

public class CollectionPlay
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String para;
		System.out.println("Enter the paragraph to be tested");
		para=sc.nextLine();
		
		String s[]= para.split(" ");
		int store[]= new int[s.length];
		int sv[]=new int[s.length];
		
		
		
		for(int i=0;i<s.length;i++)
		{
			
			sv[i]=0;
			String t1=s[i];
			
			for(int j=0;j<t1.length();j++)
			{ 
				sv[i]+=(int)(t1.charAt(j));
				
			}
			//System.out.println(s[i]+" "+sv[i]);
		}
		
		for(int i=0;i<s.length;i++)
		{
			int temp1=sv[i];
			int d;
			while(temp1!=0)
			{ d=0;
			  d=temp1%10;
			  temp1/=10;
			  store[i]=d;
			}
			
		}
		List<List<String>> Outerlist = new ArrayList<List<String>>(9);
		List<String> row1 = new ArrayList<String>(1);
		List<String> row2 = new ArrayList<String>(2);
		List<String> row3 = new ArrayList<String>(3);
		List<String> row4 = new ArrayList<String>(4);
		List<String> row5 = new ArrayList<String>(5);
		List<String> row6 = new ArrayList<String>(6);
		List<String> row7 = new ArrayList<String>(7);
		List<String> row8 = new ArrayList<String>(8);
		List<String> row9 = new ArrayList<String>(9);
		for(int i=0;i<s.length;i++)
		{
			int c=store[i];
			switch(c)
			{
				case 1: 
						row1.add(s[i]);
						break;
			    case 2:
						row2.add(s[i]);
						break;
				case 3: 
						row3.add(s[i]);
						break;
				case 4: 
						row4.add(s[i]);
						break;
				case 5: 
						row5.add(s[i]);
						break;
				case 6: 
						row6.add(s[i]);
						break;
				case 7: 
						row7.add(s[i]);
						break;
				case 8: 
						row8.add(s[i]);
						break;
				case 9: 
						row9.add(s[i]);
						break;
				default:
			}
			Outerlist.add(row1);
			Outerlist.add(row2);
			Outerlist.add(row3);
			Outerlist.add(row4);
			Outerlist.add(row5);
			Outerlist.add(row6);
			Outerlist.add(row7);
			Outerlist.add(row8);
			Outerlist.add(row9);
			
			
		}
		/*Iterator itr= Outerlist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for (int k=0; k<9;k++)
        System.out.println("Row number "+(k+1)+"  is"+Outerlist.get(k));
		
		
				
	
	}
} 	

		
				