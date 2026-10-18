class Main {
    public static void main(String[] args) {
        int[] arr={2,5,8,11,14,7};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
               even+=1;
           } 
            else{
                odd+=1;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
