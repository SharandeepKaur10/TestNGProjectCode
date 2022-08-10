package com.testng.code;

import org.testng.annotations.Test;

public class Pattern2 {
@Test
public void pattern2Test()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
	}
		System.out.println();

}}
}
