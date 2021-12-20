package exercise2;

import java.util.Scanner;



public class EvenOrOddNumber {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int number = input.nextInt();
     System.out.print("Number is ");
    int result = number%2;
    if( result == 0 ){
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
    }
   }
