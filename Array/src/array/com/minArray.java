package array.com;

public class minArray {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    int min=arr[0];
	    for(int i=1;i<arr.length;i++)
	    {
	    	if(min>arr[i])
	    	{
	    		arr[i]=min;
	    	}
	    }
	    System.out.println("Minimum element is:"+ min);
	}

}
