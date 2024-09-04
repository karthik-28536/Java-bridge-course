import java.util.Scanner;
class Rays
{
	public static void main(String[] args)
	{
	Scanner kv = new Scanner(System.in);
	int i,j;
	int n=kv.nextInt(); 
	int arr[]=new int[n];
	for(i=0;i<n;i++){
	arr[i]=kv.nextInt();
}
	for(i=0;i<n;i++){
	System.out.println(arr[i]);
}
}
}