package Arrays;

public class Program9 {
	public int[] withoutTen(int[] nums) {

		  int[] result = new int[nums.length];
		  int k = 0;
		  for (int i = 0; i < nums.length; i++)
		  {
		      if (nums[i] != 10)
		      {
		          result[k++] = nums[i];

		      }
		  }
		  return result;
		}
}
