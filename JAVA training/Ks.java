import java.util.Scanner;
class Ks
{
	public static void main(String[] args)
	{
	int a,b,c;
	Scanner Sn = new Scanner(System.in);
	a = Sn.nextInt();
	b = Sn.nextInt();
	c = Sn.nextInt();
	if((a>b)&&(a>c))
	{
	System.out.println("a is Greater");
	}
	else if((b>a)&&(b>c))
	{
	System.out.println("b is greater");
	}
	else
	{
	System.out.println("c is greater");
	}
 }
}

	