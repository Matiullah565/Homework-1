package trinale;

import java.util.Scanner;

public class Tringale {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C, a, b, c, x1, x2, x3, y1, y2, y3;
        System.out.println("give me the value of x1 :");
        x1 = input.nextDouble();
        System.out.println("give me the value of y1 :");
        y1 = input.nextDouble();
        System.out.println("give me the value of x2 :");
        x2 = input.nextDouble();
        System.out.println("give me the value of y2 :");
        y2 = input.nextDouble();
        System.out.println("give me the value of x3 :");
        x3 = input.nextDouble();
        System.out.println("give me the value of y3 :");
        y3 = input.nextDouble();

        a = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      
        A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        C = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        
        System.out.println("The value of A is:  " + A +"\n The value of B is:  " + B +
                "\n The value of C is:  " + C );
    }

}
