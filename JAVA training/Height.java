import java.util.Scanner;
class Height
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Karthi height");
		float Karthiheight = input.nextFloat();

		System.out.print("Enter Sri height");
		float Sriheight = input.nextFloat();

		System.out.print(Karthiheight>Sriheight);
	}
}
