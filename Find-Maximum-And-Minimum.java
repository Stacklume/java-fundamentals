class Main {
    public static void main(String[] args) {
        int[] arr={2,5,8,11,14,7};
        int minn=arr[0];
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>maxx){
               maxx=arr[i];
           } 
            if(arr[i]<minn) {
                minn=arr[i];
            }
        }
        System.out.println("Minimum :"+minn);
        System.out.println("Maximum :"+maxx);
    }
}
