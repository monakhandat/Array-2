class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        if(nums==null || nums.length==0)
            return output;
        
        
        for(int i=0; i<nums.length; i++)
        {
            
            int temp = nums[i];
            // If temp is already made negative, in case of repeated numbers
            if(temp<0)
                temp *=-1;
            // Make the number at temp-1 negative if its not already negative
            
            if(nums[temp-1] > 0)
                nums[temp-1] *= -1;
    
        }
        
        for(int i=0; i< nums.length;i++)
        {
            if(nums[i]>0)
                output.add(i+1);
        }
        
        return output;
    }
    
}

// TC - O(N)
// SC- O(1)
/* Logic-
- For each of the number that is present in array, multiply the number at that index-1 with -1
- Check if the number at that index-1 is already negative, if its already negative then make temp positive and make nums[temp-1] only negative when it is positive
- Iterate through the array and add index+1 to output list where nums[index] > 0
*/
