import java.util.Arrays;

public class leetcode {

	public static void main(String[] args) {
		
	int[] arr = {8,1,2,2,3};
	int[] num = new int[arr.length];
	
	for(int i = 0; i< arr.length; i++)
	{
		System.out.println(arr[i]);
		int count = 0;
		
		for(int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
			if(arr[i] > arr[j] && j != i)
			{
				count++;
			}
			
		}
		num[i] = count;
	}
	System.out.println(Arrays.toString(num));
	}

}
