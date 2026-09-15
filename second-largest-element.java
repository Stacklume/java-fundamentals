class Solution {
    public int secondLargestElement(int[] nums) {
        int maxx=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxx){
                sec_max=maxx;
                maxx=nums[i];
            }
            else if(nums[i]<maxx && nums[i]>sec_max){
                sec_max=nums[i];
                
            }
        }
            if(sec_max==Integer.MIN_VALUE){
                return -1;
            }
        return sec_max;
    }
}
