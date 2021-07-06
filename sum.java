import java.util.*;
public class sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter array size: ");
int n;
n=sc.nextInt();
int arr[]=new int[n];
System.out.print("Enter the array elements: ");
int i,j,s1,s2,product;
for(i=0;i<=n/2;i++)
{
s1=s1+arr[i];
System.out.println(s1);
}
for(j=n/2;j>=n;j++)
{
s2=s2+arr[j];
System.out.println(s2);
}
System.out.println("product=s1*s2");
}
}

