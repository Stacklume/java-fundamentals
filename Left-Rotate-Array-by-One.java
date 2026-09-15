//Given an integer array nums, rotate the array to the left by one.
class Solution {
    public void rotateArrayByOne(int[] nums) {
        int first=nums[0];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=first;
    }
}
