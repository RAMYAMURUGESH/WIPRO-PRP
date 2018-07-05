import java.util.*;
class player
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,sum,max=0,pos=0,j,t=0;

System.out.println("ENTER THE NO.OF.PLAYERS");
n=in.nextInt();
System.out.println("ENTER THE PLAYERS NAME:");
String player[]=new String[n];
for(i=0;i<n;i++)
{
player[i]=in.next();
}
System.out.println("ENTER THE SCORES:");
String score=in.next();
char ch[]=score.toCharArray();


int a[]=new int[n];
for(i=0;i<n;i++)
{
sum=0;
for(j=i;j<score.length();)
{
sum=sum+Character.getNumericValue(ch[j]);
j=j+n;
}
a[t]=sum;
t++;
}
for(i=0;i<t;i++)
{
if(max<a[i])
{
max=a[i];
pos=i;
}
}
System.out.println("MAN OF THE MATCH : "  +  player[pos] );
System.out.println("SCORE        : "  +  a[pos]);
}}
