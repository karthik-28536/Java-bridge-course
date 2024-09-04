import java.util.Scanner;
class Shopping
{
	public static void main(String[] args)
	{
	Scanner Karthik = new Scanner(System.in);
	int n1,n2,add,sub,div,mulit;
	System.out.println("Enter the first number");
	n1 = Karthik.nextInt();
	System.out.println("enter the second number");
	n2 = Karthik.nextInt();
	add = n1+n2;
	sub = n1-n2;
	mulit = n1*n2;
	div = n1/n2;

	System.out.println("add is "+add);
	System.out.println("sub is "+sub);
	System.out.println("mulit is "+mulit);
	System.out.println("div is  "+div);
	}
}