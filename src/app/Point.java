/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

/**
 *
 * @author francesco
 */
public class Point implements Comparable<Point>{
    public double x;
    public double y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override // ritorna valore negativo se this è minore, 0 se uguale, positivo se maggiore
    public int compareTo(Point p) {
        // se le x sono uguali confronta le y
        if (this.x == p.x)
            return (int)(this.y - p.y);
        
        return (int)(this.x - p.x);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + this.x + ", y=" + this.y + "}";
    }
        
}
