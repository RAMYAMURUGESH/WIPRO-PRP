//to print the series:1/1+2^2/2+3^3/3+4^4/4+5^5/5

import java.util.*;
class series1
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j,sum=0,pro;
System.out.println("ENTER THE INPUT:");
n=in.nextInt();
for(i=1;i<=n;i++)
{
pro=1;
for(j=1;j<i;j++)
{
pro=pro*i;
}
sum=sum+pro;
}
System.out.println("THE ANSWER FOR THE SERIES IS : " +  sum);
}
}
