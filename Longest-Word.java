class Solution {
    public String longest(String[] arr) {
        String s="";
        for(int j=0;j<arr.length;j++){
            if(arr[j].length()>s.length()){
                s=arr[j];
            }  
        }return s;
    }
}
