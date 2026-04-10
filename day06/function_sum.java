package day06;
import java.util.*;
public class function_sum {
    public static void claculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is " +sum);
        sc.close();
    }
    public static void main(String args[]){
        claculateSum(); 
    }

}
