package com.testng.code;

import org.testng.annotations.Test;

public class Pattern1 {
@Test
public void Pattern1Test()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
	}
		System.out.println();

}

}
}
