package array.com;

public class SearchArray {
	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50};
		int key=20;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				found=true;
				System.out.println("Element found");
				break;
			}
		}
		if(!found)
		{
			System.out.println("number not found");
		}
	}

}
