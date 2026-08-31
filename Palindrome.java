import java.util.*;
public class Main{
  public static void main(String[] args){
    String word="safa";
    int i=0;
    int j=word.length()-1;
    while(i<j){
        if(word.charAt(i)!=word.charAt(j)){
            System.out.print("Not a Palindrome");
            return;
        }
        i++;
        j--;
    }
    System.out.print("Palindrome");    
            }
        }
