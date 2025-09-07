package zoho;

import java.util.Scanner;

public class longpalindrome {
	public static boolean pal(String s,int i,int j)
	{
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static String longP(String s)
	{
		int ml=0,st=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				if(pal(s,i,j))
				{
					if(j-i+1>ml)
					{
						ml=j-i+1;
						st=i;						
					}
				}
			}
		}
		
		String res="";
		for(int i=st;i<st+ml;i++)
		{
			res+=s.charAt(i);
		}
		
		
		return res;
	}
	public static void main(String[] args) {
		String data="racecarxyz";
		System.out.println(longP(data));
				
	}
}
