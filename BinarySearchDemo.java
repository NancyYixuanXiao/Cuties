//Demonstrate the binary search algorithm

public class BinarySearchDemo {
	
	public static void main(String[] args){
		
		int[] array = {1,3,4,6,8,9};
		int p = binarySearch(array, 7);
		System.out.println("The position is " + p);
	}
	
	public static int binarySearch(int[] arr, int target)
	{
		int first = 0, last = arr.length - 1;
		boolean found = false;
		int position = -1;
		
		while (!found && first <= last)
		{
			int middle = first + (last - first) / 2;
			
			if (arr[middle] == target)
			{
				found = true;
				position = middle;
			}
			else if (arr[middle] < target)
			{
				first = middle + 1;
			}
			else
			{
				last = middle - 1;
			}
		}
		return position;
	}
}
