package cdac.in;

public class Searching
{
	public void BinarySearch(int[] arr, int value)
	{
		int start = 0;
		int end = arr.length;
		int middle = (start + end) / 2;

		if (value == arr[middle])
		{
			System.out.println("Value : " + value + " found at index " + middle);
		}

		if (value < arr[middle])
		{
			for (int i = start; i < middle; i++)
			{
				if (value == arr[i])
				{
					System.out.println("Value : " + value + " found at index " + i);
				}
			}
		}

		if (value > arr[middle])
		{
			for (int i = middle + 1; i <= end; i++)
			{
				if (value == arr[i])
				{
					System.out.println("Value : " + value + " found at index " + i);
				}
			}
		}
	}
	
		public void LinearSearch(int arr[], int value)
		{
			for (int i = 0; i < arr.length; i++)
			{
				if (value == arr[i])
				{
					System.out.println("Value : " + value + " found at index " + i);
				}
			}
		}
	
}
