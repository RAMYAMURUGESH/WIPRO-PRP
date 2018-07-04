//to print the series:1/1!+2^2/2!+3^3/3!+4^4/4!+5^5/5!

import java.util.*;
class series2
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n;
double i,j,pro,fact,sum=0,t;
System.out.println("ENTER THE INPUT :");
n=in.nextInt();
for(i=1;i<=n;i++)
{
pro=1;
fact=1;
for(j=1;j<=i;j++)
{
pro=pro*i;
fact=fact*j;
}
t=pro/fact;
//System.out.println(t);
sum=sum+t;
}
System.out.println("THE ANSWER FOR THE SERIES " + sum);
}}
