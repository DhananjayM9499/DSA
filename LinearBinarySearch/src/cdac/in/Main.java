package cdac.in;


public class Main
{

	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Searching ls = new Searching();
		ls.BinarySearch(array, 3);
		ls.LinearSearch(array, 9);
	}

}