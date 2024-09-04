import java.util.Scanner;
class Vote
{
	public static void main(String[] args)
	{
	int age;
	Scanner Karthi = new Scanner(System.in);	
	age = Karthi.nextInt();
	if(age>=18)
	{
	System.out.println("Eligible");
	}
	else
	{
	System.out.println("Not eligible");
	}
}
} 