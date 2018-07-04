//ip:wipro technology
//op:wpori tcnlgyoohe

import java.util.*;
class strmodify
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,n,t1,t2,k1,k2;
/*System.out.println("ENTER THE SIZE OF THE ARRAY:");
n=in.nextInt();
String a[]=new String[n];*/
char ch1[]=new char[100];
char ch2[]=new char[100];
System.out.println("ENTER THE INPUT:");
String a[]=in.nextLine().split(" "); 
for(i=0;i<a.length;i++)
{
char ch[]=a[i].toCharArray();
t1=0;
t2=0;
for(j=0;j<ch.length;j++)
{
if(j%2==0)
{
ch1[t1]=ch[j];
t1++;
}
else
{
ch2[t2]=ch[j];
t2++;
}
}
//System.out.println(t2);
for(k1=0;k1<t1;k1++)
{
System.out.print(ch1[k1]);
}
for(k2=t2-1;k2>=0;k2--)
{
System.out.print(ch2[k2]);
}
System.out.print(" ");
}
}}
