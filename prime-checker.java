import java.util.*;
class Main {
    public static void main(String[] args) {
     int n=17;
     boolean prime=true;
     if(n<2){
        prime=false;
     }
     for(int i=2;i<n;i++){
        if(n%i==0){
            prime=false;
            break;
        }
     }
     if(prime){
        System.out.print("Prime");
     }
     else{
        System.out.print("Not Prime");
     }
    }
}
