// Demonstrate the bubble sort algorithm.

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,7,5,1,9,12,8};
		bubbleSort(array);
		printArray(array);
	}
	
	public static void bubbleSort(int[] arr)
	{
		int last, index, temp;
		for (last=arr.length-1; last>0; last--)
		{
			for (index=0; index<last; index++)
			{
				if (arr[index]>arr[index+1])
				{
					temp = arr[index];
					arr[index] = arr[index+1];
					arr[index+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print(' ');
		}
		System.out.println();
	}
}
