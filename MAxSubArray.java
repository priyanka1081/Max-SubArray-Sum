package Arrays;

public class MAxSubArray {
	
	 public int maxSubArray(int[] nums) {
	       int maxSoFar=Integer.MIN_VALUE;
	        int maxEnd=0;
	        
	        for(int i=0; i<nums.length; i++) {
	        	maxEnd= maxEnd+ nums[i];
	        	if(maxSoFar<maxEnd)
	        		maxSoFar= maxEnd;
	        	if(maxEnd<0)
	        		maxEnd=0;
	        }
	        return maxSoFar;
	    }

	public static void main(String[] args) {
		MAxSubArray ms= new MAxSubArray();
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(ms.maxSubArray(nums));

	}

}
