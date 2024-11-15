/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doloramont;

import java.util.Scanner;

/**
 *
 * @author Matiullah Nasiri
 */
public class DolorAmont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" write your dolor amount : ");
        double userDolor = input.nextDouble();
        int userInt = (int) userDolor;
        double userDecimal = userDolor - userInt;

        double quater, dimmes, nickle, pennis;
        quater = userInt * 4;
        dimmes = userInt * 10;
        nickle = userInt * 100;
        pennis = userDecimal / 5;

        System.out.println(userDolor + "  \n is made from \n " + quater + "  Quater \n "
                + dimmes + "  Dimmes \n " + nickle + " Nickle \n" + pennis + "   Pinnes");
    }

}
