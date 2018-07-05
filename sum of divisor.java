//to print the sum of divisors

import java.util.*;

public class sumdivisor{

     public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("ENTER THE INPUT:");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("THE SUM OF ITS DIVISOR IS " + sum);
     }
}
