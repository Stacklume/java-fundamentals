import java.util.*;
public class Main{
  public static void main(String[] args){
    int[] nums ={10, 5, 20, 8, 15}; 
    int max=0;
    int sec_max=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
    }
    for(int j=0;j<nums.length;j++){
        if(nums[j]>sec_max && nums[j]<max){
            sec_max=nums[j];
        }
    }
    System.out.print(sec_max);
            }
        }
