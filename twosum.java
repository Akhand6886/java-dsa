package leetcode;

public class twosum {
	
	public static void main(int[] nums, int target)
		{
		int i;
		int n = nums.length;
		for(i=0;i<n-1;i++)
		{
			if(nums[i]+nums[i+1]==target)
			{
				System.out.println(i);
				break;
			}
		}
			
		}
		
		
	
	
}
