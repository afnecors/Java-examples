/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author francesco
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Point> punti = new ArrayList<Point>();
        punti.add(new Point(43, 55));
        punti.add(new Point(43, 2.2));
        punti.add(new Point(43.3, 4));
        punti.add(new Point(4, 11.1));
        punti.add(new Point(13, 21));
        punti.add(new Point(13, 22));
        punti.add(new Point(1, 2));

        System.out.println("Punti:");
        for (Point p : punti) {
            System.out.println("\t" + p.toString());
        }

        Collections.sort(punti);

        System.out.println("\nPunti ordinati:");
        for (Point p : punti) {
            System.out.println("\t" + p.toString());
        }

    }

}
