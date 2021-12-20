package exercise2;

import java.util.Scanner;
import java.lang.Math;;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    double Pi = Math.PI;
    double r = input.nextDouble();
    double C = 2*Pi*r;
    double A = Pi*r*r;
      System.out.println("Circumference: "+ C);
      System.out.println("Area: " + A);

    }

}
