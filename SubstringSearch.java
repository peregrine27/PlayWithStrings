import java.util.Scanner;
public class SubstringSearch
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1,s2;
		int f=0;
		System.out.println("Enter the string for testing\t");
		s1=sc.nextLine();
		System.out.println("Enter the substring that needs to be searched\t");
		s2=sc.nextLine();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				String temp=s1;
				int c=0;
				if(s2.length()>1)
			    {
				for(int j=1,k=i+1;j<s2.length();j++,k++)
				{
					if(s2.charAt(j)!=s1.charAt(k))
						break;
					else
						c++;
				}
				if(c==s2.length())
				{
					System.out.println("Substring's first occurrence found at\t"+(i+1));
					f=1;
					break;
				}
				}
				System.out.println("Substring's first occurrence found at\t"+(i+1));
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println("The substring does not exist in the entered string");
		else
			System.out.println("Substring exists");
	}
}
