/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Arrays;

/**
 *
 * @author francesco
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Point[] punti = new Point[7];
        
        punti[0] = new Point(43, 8);
        punti[1] = new Point(11, 7);
        punti[2] = new Point(47, 42);
        punti[3] = new Point(47, 1);
        punti[4] = new Point(43, 12);
        punti[5] = new Point(43.3, 4);
        punti[6] = new Point(4, 11.1);
        

        System.out.println("Punti:");
        for (Point p : punti) {
            System.out.println("\t" + p.toString());
        }

        Arrays.sort(punti);

        System.out.println("\nPunti ordinati:");
        for (Point p : punti) {
            System.out.println("\t" + p.toString());
        }

    }

}
