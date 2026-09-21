package array.com;

public class Alternate {
	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("Alternate elements");
	for(int i=0;i<arr.length;i=i+2)
	{
		System.out.print(arr[i] + " ");
	}
	}
}
