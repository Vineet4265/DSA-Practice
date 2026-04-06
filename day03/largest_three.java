package day03;

public class largest_three {
    public static void main(String[] args) {
        int a = 1; int b = 2; int c = 3;
        if((a >= b) && (a >=c)){
            System.out.println("a is largest of three");
        }
        else if(b >= c){
            System.out.println("b is largest of three");
        }
        else{
            System.out.println("c is largest of three");
        }
    }
}
