class Main {
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,3,4,4};
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
        }
        System.out.print(count);
            
    }
}
