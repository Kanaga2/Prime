# Prime
import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=1;i<n;i++)
{
if(n%1==0)
{
count++;
}
}
if(count==0)
{
System.out.println("It is a prime");
}
else
{
System.out.println("It is not a prime");
}
}
}
