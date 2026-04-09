package day04;
import java.util.*;
public class evenodd_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.print("Enter a number ");
             number = sc.nextInt();
            if(number%2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.print("Do you want me to continue?press 1 for yes and 0 for no ");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("Sum of even numbers "+evenSum);
        System.out.println("Sum of odd numbers "+oddSum);
        sc.close();
    }
}
