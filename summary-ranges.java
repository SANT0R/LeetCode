class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> resault = new ArrayList<String>();
        for (int i=0;i<nums.length;i++){
            int j=1;
            if((i+2)<=nums.length&&((nums[i]+1)==nums[i+1])){
                
                for(;j+i+1<=nums.length&&((nums[i]+j)==nums[i+j]);j++){}
                
                resault.add(Integer.toString(nums[i])+"->"+Integer.toString(nums[i+j-1]));
            }
            else{
                
            resault.add(Integer.toString(nums[i]));
            }
                i+=j-1;
        }
    return resault;
    }
}
