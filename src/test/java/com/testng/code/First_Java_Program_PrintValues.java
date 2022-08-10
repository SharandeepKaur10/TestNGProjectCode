package com.testng.code;

import org.testng.annotations.Test;

public class First_Java_Program_PrintValues {
@Test
public void printValues()
{
int i=100;//latest value of i=100
int j=i++;//latest value of j=100,latest value of i=101
int k=++i - --i + i-- - ++i;//k= 102-101+101-101=1,latest value of k=1,i=101
int l=k-- -++k + i-- -++i +i--;//l=1-1+101-101+101=101,latest value of l=101,i=100
int m=i++ + i-- - ++i + --i +j++ -k-- +l-- -++l;//m=100+101 -101+100+100-1+101 -101=299,
//latest value of m==299,i=100,j=101,k=0,l=101

System.out.println(i);
System.out.println(j);
System.out.println(k);
System.out.println(l);
System.out.println(m);
}
}
