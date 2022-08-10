package com.testng.code;

import org.testng.annotations.Test;

public class Pattern5 {
@Test
public void pattern5Test()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
	}
		System.out.println();
	

}}
}
