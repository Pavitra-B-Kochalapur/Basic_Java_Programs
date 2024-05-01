import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArrays {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		int n = 3;
		
	int i = 0; 
	int k = 0;
	int j = n;
	int[] res = new int[2*n];
	while(i < n && j < nums.length) {
	//	res[k++] = nums[i];
	//	System.out.println(res);
		res[k++] = nums[j];
//System.out.println(res);
		i++;
		j++;

		
		
	}
	System.out.println(Arrays.toString(res));
	}
	

}
