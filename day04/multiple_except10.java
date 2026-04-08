package day04;
import java.util.*;
public class multiple_except10 {
    public static void main(String args[]){
        do{
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%10 == 0){
            continue;
        }
        System.out.println("Number was "+n);
        sc.close();
        }while(true);
    
    }
}
