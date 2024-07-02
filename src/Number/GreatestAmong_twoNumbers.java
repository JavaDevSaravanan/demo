package Number;

import java.util.Scanner;

public class GreatestAmong_twoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number A :");
        int A = scan.nextInt();
        System.out.println("Enter The Number B :");
        int B =scan.nextInt();
        scan.close();

        if(A<B){
            System.out.println("B is greater");
        }else if(B<A){
            System.out.println("A is greater");
        }else{
            System.out.println("Both Are Same");
        }


    }
}
