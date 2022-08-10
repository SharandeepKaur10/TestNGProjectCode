package com.testng.code;

import org.testng.annotations.Test;

public class Pattern6 {
@Test
public void pattern6Test()
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
