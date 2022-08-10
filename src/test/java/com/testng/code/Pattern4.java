package com.testng.code;

import org.testng.annotations.Test;

public class Pattern4 {
@Test
public void pattern4Test()
{
	for (int i=1; i<=5;i++)
	{
		for(int j=1; j<=i;j++)
		{System.out.print("*");
		}
		System.out.println();
	}
	for(int i=2; i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
		}

}
}

