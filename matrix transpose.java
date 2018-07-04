//to print the reversee of transposee of 2d matrix

import java.util.*;
class strtran
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m,n,i,j;
System.out.println("ENTER THE ROWS AND COLOUMNS:");
m=in.nextInt();
n=in.nextInt();
System.out.println("ENTER THE INPUT:");
int a[][]=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=in.nextInt();
}
}
System.out.println("THE RESULT OF THE REVERSE TRANSPOSE IS:");
for(i=n-1;i>=0;i--)
{
for(j=0;j<m;j++)
{
System.out.print(a[j][i]  +  " ");
}
System.out.println();
}
}}
