class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int small=Integer.MAX_VALUE;
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        result.add(small);
        result.add(lar);
        return result;
    }
}
