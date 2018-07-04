//to find the factorial sum of 5!=5!+4!+3!+2!+1!

import java.util.*;
class factorialsum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,pro,totsum=0;
System.out.println("ENTER THE INPUT:");
n=in.nextInt();
for(i=1;i<=n;i++)
{
pro=1;
for(j=1;j<=i;j++)
{
pro=pro*j;
}
totsum=totsum+pro;
}
System.out.println("THE SUM OF THE FACTORIALS FOR GIVEN n IS  "  +  totsum);
}
}
